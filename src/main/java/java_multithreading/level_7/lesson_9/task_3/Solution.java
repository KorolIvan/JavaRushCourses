package java_multithreading.level_7.lesson_9.task_3;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class Solution {
    public static void main(String[] args) {
        Mail mail = new Mail();
        Thread server = new Thread(new MailServer(mail));
        Thread amigo = new Thread(new Person(mail));

        server.start();
        amigo.start();
    }
}
