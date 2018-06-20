package Java_Collections.level_7.lesson_15.bigparser;

import Java_Collections.level_7.lesson_15.bigparser.query.IPQuery;
import Java_Collections.level_7.lesson_15.bigparser.query.UserQuery;

import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import java.text.DateFormat;
/**
 * @author Ivan Korol on 6/18/2018
 */
public class LogParser implements IPQuery, UserQuery {
    private Path logDir;
    List<String> logs = new ArrayList<>();
    ArrayList<PartOfLog> partsOfLogs = new ArrayList<>();

    public LogParser(Path logDir) {
        this.logDir = logDir;
        this.logs = processFilesFromFolder(logs, logDir.toFile());
        for (String s : logs) {
            parseString(s);
        }
    }

    public static class PartOfLog {
        public String ip;
        public String user;
        public Date date;
        public Event event;
        public String numberOfTask;
        public Status status;

        public PartOfLog(String ip, String user, Date date, Event event, String numberOfTask, Status status) {
            this.ip = ip;
            this.user = user;
            this.date = date;
            this.event = event;
            this.numberOfTask = numberOfTask;
            this.status = status;
        }

        @Override
        public String toString() {
            return "PartOfLog{" +
                    " ip='" + ip + '\'' +
                    ", user='" + user + '\'' +
                    ", date=" + date +
                    ", event=" + event +
                    ", numberOfTask='" + numberOfTask + '\'' +
                    ", status=" + status +
                    '}';
        }
    }

    //смотрим директорию logDir, ищем файлы с логами
    private List<String> processFilesFromFolder(List<String> logs, File file) {
        File[] folderEntries = file.listFiles();
        for (File entry : folderEntries) {
            if (entry.isDirectory()) {
                processFilesFromFolder(logs, entry);
            }
            if (entry.isFile() && entry.getName().endsWith(".log")) {
                logs.addAll(loadListOfLogsFromFiles(entry));
            }
        }
        return logs;
    }

    //загружаем все строки логов из файлов в список
    private List<String> loadListOfLogsFromFiles(File entry) {
        List<String> listLogs = new ArrayList<>();
        try {
            listLogs = Files.readAllLines(entry.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLogs;
    }

    void parseString(String str) {
        String[] partOfString = str.trim().split("\t");
        String IP = partOfString[0].trim();
        String name = partOfString[1];
        Date date = null;
        Event event = null;
        String numberTask = null;
        Status status = null;

        for (int i = 2; i < partOfString.length; i++) {
            if (parseDate(partOfString[i], "d.M.y H:m:s") != null) {
                date = parseDate(partOfString[i], "d.M.y H:m:s");
                String[] pairEventAndNumber = partOfString[i + 1].split(" ");
                event = Event.valueOf(pairEventAndNumber[0].toUpperCase());
                if (pairEventAndNumber.length > 1 && (event.name().equals("SOLVE_TASK") || event.name().equals("DONE_TASK"))) {
                    numberTask = pairEventAndNumber[1];
                }
                if (i != partOfString.length - 1) {
                    status = Status.valueOf(partOfString[partOfString.length - 1].toUpperCase());
                }
                break;
            } else {
                name = (name + " " + partOfString[i]);
            }
        }
        partsOfLogs.add(new PartOfLog(IP, name, date, event, numberTask, status));
    }

    Date parseDate(String s, String pattern) {
        DateFormat formatter = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = formatter.parse(s);
        } catch (ParseException e) {
        }
        return date;
    }

    private boolean isDateInRange(Date check, Date after, Date before) {
        boolean fits = before == null || check.before(before) || check.equals(before);
        return fits && (after == null || check.after(after) || check.equals(after));
    }

    private Set<String> getIPs(ArrayList<PartOfLog> parts, Date after, Date before) {
        Set<String> uniqueIPs = new HashSet<>();
        if (after == null && before == null) {
            for (PartOfLog part : parts) {
                uniqueIPs.add(part.ip);
            }
        }
        for (PartOfLog part : parts) {
            if (isDateInRange(part.date, after, before)) {
                uniqueIPs.add(part.ip);
            }
        }
        return uniqueIPs;
    }

    @Override
    public int getNumberOfUniqueIPs(Date after, Date before) {
        Set<String> uniqueIPs = getUniqueIPs(after, before);
        return uniqueIPs.size();
    }

    @Override
    public Set<String> getUniqueIPs(Date after, Date before) {
        return getIPs(partsOfLogs, after, before);
    }

    @Override
    public Set<String> getIPsForUser(String user, Date after, Date before) {
        ArrayList<PartOfLog> partsFilterUsers = new ArrayList<>();
        for (PartOfLog p : partsOfLogs) {
            if (p.user.equals(user)) {
                partsFilterUsers.add(p);
            }
        }
        return getIPs(partsFilterUsers, after, before);
    }

    @Override
    public Set<String> getIPsForEvent(Event event, Date after, Date before) {
        ArrayList<PartOfLog> partsFilterEvent = new ArrayList<>();
        for (PartOfLog p : partsOfLogs) {
            if (p.event.equals(event)) {
                partsFilterEvent.add(p);
            }
        }
        return getIPs(partsFilterEvent, after, before);
    }

    @Override
    public Set<String> getIPsForStatus(Status status, Date after, Date before) {
        ArrayList<PartOfLog> partsFilterStatus = new ArrayList<>();
        for (PartOfLog p : partsOfLogs) {
            if (p.status.equals(status)) {
                partsFilterStatus.add(p);
            }
        }
        return getIPs(partsFilterStatus, after, before);
    }

    private Set<String> getUsers(ArrayList<PartOfLog> parts, Date after, Date before) {
        Set<String> uniqueUsers = new HashSet<>();
        if (after == null && before == null) {
            for (PartOfLog part : parts) {
                uniqueUsers.add(part.user);
            }
        }
        for (PartOfLog part : parts) {
            if (isDateInRange(part.date, after, before)) {
                uniqueUsers.add(part.user);
            }
        }
        return uniqueUsers;
    }

    @Override
    public Set<String> getAllUsers() {
        Set<String> allUsers = new HashSet<>();
        for (PartOfLog p : partsOfLogs) {
            allUsers.add(p.user);
        }
        return allUsers;
    }

    @Override
    public int getNumberOfUsers(Date after, Date before) {
        return getUsers(partsOfLogs, after, before).size();
    }

    @Override
    public int getNumberOfUserEvents(String user, Date after, Date before) {
        ArrayList<PartOfLog> partsFilterUser = new ArrayList<>();
        for (PartOfLog p : partsOfLogs) {
            if (p.user.equals(user)) {
                partsFilterUser.add(p);
            }
        }
        Set<String> uniqueEvents = new HashSet<>();
        if (after == null && before == null) {
            for (PartOfLog part : partsFilterUser) {
                uniqueEvents.add(part.event.toString());
            }
        }
        for (PartOfLog part : partsFilterUser) {
            if (isDateInRange(part.date, after, before)) {
                uniqueEvents.add(part.event.toString());
            }
        }
        return uniqueEvents.size();
    }

    @Override
    public Set<String> getUsersForIP(String ip, Date after, Date before) {
        ArrayList<PartOfLog> partsFilterIP = new ArrayList<>();
        for (PartOfLog p : partsOfLogs) {
            if (p.ip.equals(ip)) {
                partsFilterIP.add(p);
            }
        }
        return getUsers(partsFilterIP, after, before);
    }

    @Override
    public Set<String> getLoggedUsers(Date after, Date before) {
        ArrayList<PartOfLog> partsFilterLogged = new ArrayList<>();
        for (PartOfLog p : partsOfLogs) {
            if (p.event.equals(Event.LOGIN)) {
                partsFilterLogged.add(p);
            }
        }
        return getUsers(partsFilterLogged, after, before);
    }

    @Override
    public Set<String> getDownloadedPluginUsers(Date after, Date before) {
        ArrayList<PartOfLog> partsFilterDownloadedPlugin = new ArrayList<>();
        for (PartOfLog p : partsOfLogs) {
            if (p.event.equals(Event.DOWNLOAD_PLUGIN) && p.status.equals(Status.OK)) {
                partsFilterDownloadedPlugin.add(p);
            }
        }
        return getUsers(partsFilterDownloadedPlugin, after, before);
    }

    @Override
    public Set<String> getWroteMessageUsers(Date after, Date before) {
        ArrayList<PartOfLog> partsFilterWroteMessage = new ArrayList<>();
        for (PartOfLog p : partsOfLogs) {
            if (p.event.equals(Event.WRITE_MESSAGE)) {
                partsFilterWroteMessage.add(p);
            }
        }
        return getUsers(partsFilterWroteMessage, after, before);
    }

    @Override
    public Set<String> getSolvedTaskUsers(Date after, Date before) {
        ArrayList<PartOfLog> partsFilterSolvedTask = new ArrayList<>();
        for (PartOfLog p : partsOfLogs) {
            if (p.event.equals(Event.SOLVE_TASK)) {
                partsFilterSolvedTask.add(p);
            }
        }
        return getUsers(partsFilterSolvedTask, after, before);
    }

    @Override
    public Set<String> getSolvedTaskUsers(Date after, Date before, int task) {
        ArrayList<PartOfLog> partsFilterSolvedTask = new ArrayList<>();
        for (PartOfLog p : partsOfLogs) {
            if (p.event.equals(Event.SOLVE_TASK) && Integer.parseInt(p.numberOfTask) == task) {
                partsFilterSolvedTask.add(p);
            }
        }
        return getUsers(partsFilterSolvedTask, after, before);
    }

    @Override
    public Set<String> getDoneTaskUsers(Date after, Date before) {
        ArrayList<PartOfLog> partsFilterDoneTask = new ArrayList<>();
        for (PartOfLog p : partsOfLogs) {
            if (p.event.equals(Event.DONE_TASK)) {
                partsFilterDoneTask.add(p);
            }
        }
        return getUsers(partsFilterDoneTask, after, before);
    }

    @Override
    public Set<String> getDoneTaskUsers(Date after, Date before, int task) {
        ArrayList<PartOfLog> partsFilterDoneTask = new ArrayList<>();
        for (PartOfLog p : partsOfLogs) {
            if (p.event.equals(Event.DONE_TASK) && Integer.parseInt(p.numberOfTask) == task) {
                partsFilterDoneTask.add(p);
            }
        }
        return getUsers(partsFilterDoneTask, after, before);
    }
}

