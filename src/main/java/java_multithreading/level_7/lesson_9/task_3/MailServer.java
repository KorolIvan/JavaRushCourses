package java_multithreading.level_7.lesson_9.task_3;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class MailServer implements Runnable {
    private Mail mail;

    public MailServer(Mail mail) {
        this.mail = mail;
    }

    @Override
    public void run() {
        long beforeTime = System.currentTimeMillis();
        //сделайте что-то тут - do something here
        synchronized (mail)
        {
            while (mail.getText() == null)
                try {
                    mail.wait();
                }
                catch (Exception e) {

                }
        }
        String name = Thread.currentThread().getName();
        long afterTime = System.currentTimeMillis();
        System.out.format("%s MailServer has got: [%s] in %d ms after start", name, mail.getText(), (afterTime - beforeTime));
    }
}
