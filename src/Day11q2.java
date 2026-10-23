import java.util.Scanner;
class Notification11 {
    void sendNotification() {
        System.out.println("Sending a general notification...");
    }
}
class EmailNotification extends Notification11 {
    @Override
    void sendNotification(){
        System.out.println("Sending Email Notification...");
    }
}
public class Day11q2 {
    public static void main(String[] args) {
        EmailNotification email = new EmailNotification();
        email.sendNotification();
        Notification11 notification = new Notification11();
        notification.sendNotification();
    }
}
