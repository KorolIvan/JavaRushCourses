package Java_Collections.level_7.lesson_15.bigparser;

import Java_Collections.level_7.lesson_15.bigparser.query.IPQuery;

import java.io.IOException;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Ivan Korol on 6/18/2018
 */
import java.io.*;

import java.text.DateFormat;


public class LogParser implements IPQuery {
    private Path logDir;         // директория с логами (логов может быть несколько, все они должны иметь расширение log)
    private DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.ENGLISH);

    public LogParser(Path logDir) {
        this.logDir = logDir;
    }

    /*
     *  метод считывает данные из файла и запысивает в лист
     */
    public List<String> getLinesFromLogFile(Path path) throws IOException {
        File[] logFiles = new File(path.toString()).listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".log");
            }
        });

        List<String> lines = new ArrayList<>();
        for(int i = 0; i < logFiles.length; i++) {
            BufferedReader br = new BufferedReader(new FileReader(logFiles[i]));

            String line = "";
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }


    @Override
    public int getNumberOfUniqueIPs(Date after, Date before) {
        return getUniqueIPs(after, before).size();
    }


    @Override
    public Set<String> getUniqueIPs(Date after, Date before) {

        Set<String> setUniqueIp = new HashSet<>();

        try {
            for (String someLine : getLinesFromLogFile(logDir)) {
                String[] linesToAdd = someLine.split("\\t");

                Date current = dateFormat.parse(linesToAdd[2]);

                if (isDateRange(current, after, before))
                    setUniqueIp.add(linesToAdd[0]);

            }
        } catch (IOException | ParseException exc) {
            exc.printStackTrace();
        }
        return setUniqueIp;
    }

    @Override
    public Set<String> getIPsForUser(String user, Date after, Date before) {
        Set<String> setIpUser = new HashSet<>();
        try {
            for (String someLine : getLinesFromLogFile(logDir)) {
                String[] linesToAdd = someLine.split("\\t");
                Date current = dateFormat.parse(linesToAdd[2]);

                if (isDateRange(current, after, before)) {
                    if (user.equals(linesToAdd[1]))
                        setIpUser.add(linesToAdd[0]);
                }
            }
        } catch (IOException | ParseException exc) {
            exc.printStackTrace();
        }

        return setIpUser;
    }

    @Override
    public Set<String> getIPsForEvent(Event event, Date after, Date before) {
        Set<String> setIpEvent = new HashSet<>();
        try {
            for (String someLine : getLinesFromLogFile(logDir)) {
                String[] linesToAdd = someLine.split("\\t");

                Date current = dateFormat.parse(linesToAdd[2]);

                if (isDateRange(current, after, before)) {
                    if (event.toString().equals(linesToAdd[3].split(" ")[0]))
                        setIpEvent.add(linesToAdd[0]);
                }
            }
        } catch (IOException | ParseException exc) {
            exc.printStackTrace();
        }

        return setIpEvent;
    }

    @Override
    public Set<String> getIPsForStatus(Status status, Date after, Date before) {
        Set<String> setOfIpForStatus = new HashSet<>();

        try {
            for (String someLine : getLinesFromLogFile(logDir)) {
                String[] linesToAdd = someLine.split("\\t");
                Date current = dateFormat.parse(linesToAdd[2]);

                if (isDateRange(current, after, before)) {
                    if (status.name().equals(linesToAdd[4]))
                        setOfIpForStatus.add(linesToAdd[0]);
                }
            }
        } catch (IOException | ParseException exc) {
            exc.printStackTrace();
        }

        return setOfIpForStatus;

    }

    private boolean isDateRange(Date inputDate, Date after, Date before) {
        if (after != null && before == null) {
            if (inputDate.after(after) || inputDate.equals(after)) {
                return true;
            }
        } else {
            if (after == null && before != null) {
                if (inputDate.before(before) || inputDate.equals(after)) {
                    return true;
                }
            } else {

                if (after == null && before == null) {
                    return true;
                } else {
                    if (after != null && before != null) {
                        if (inputDate.before(before) && inputDate.after(after) || inputDate.equals(after) || inputDate.equals(before)) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}

