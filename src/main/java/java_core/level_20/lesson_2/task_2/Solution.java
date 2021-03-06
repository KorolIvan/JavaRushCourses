package java_core.level_20.lesson_2.task_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Ivan Korol on 4/30/2018
 */
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            DataOutputStream outputStream1 = new DataOutputStream(outputStream);
            outputStream1.writeInt(users.size());
            for(User user: users) {
                String firstName = (user.getFirstName() == null) ? "null" : user.getFirstName();
                outputStream1.writeUTF(firstName);
                String lastName = (user.getLastName() == null) ? "null" : user.getLastName();
                outputStream1.writeUTF(lastName);
                outputStream1.writeLong(user.getBirthDate().getTime());
                outputStream1.writeBoolean(user.isMale());
                outputStream1.writeUTF(user.getCountry().name());
            }
            outputStream1.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            int userCounter = dataInputStream.readInt();
            for (int i = 0; i < userCounter; i++) {
                User user = new User();
                String firstName = dataInputStream.readUTF();
                if(firstName.equals("null")) {
                    firstName = null;
                }
                user.setFirstName(firstName);
                String lastName = dataInputStream.readUTF();
                if(lastName.equals("null")) {
                    lastName = null;
                }
                user.setLastName(lastName);
                user.setBirthDate(new Date(dataInputStream.readLong()));
                user.setMale(dataInputStream.readBoolean());
                user.setCountry(User.Country.valueOf(dataInputStream.readUTF()));
                users.add(user);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
