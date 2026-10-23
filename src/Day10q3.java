import java.util.Scanner;
class StreamingService10 {
    String serviceName;
    int monthlySubscription;
    void displayServiceInfo() {
        System.out.println("Inside Parent Class: ");
        System.out.println("Service Name: " + serviceName);
        System.out.println("Monthly Subscription: " + monthlySubscription);
    }
}
class MusicStreaming extends StreamingService10 {
    int numberOfSongs;
    String offlineDownload;
    void displayMusicInfo() {
        System.out.println("Inside Child1 Class: ");
        System.out.println("Number of Songs: " + numberOfSongs);
        System.out.println("Offline Download: " + offlineDownload);
    }
}
class VideoStreaming extends StreamingService10 {
    int videoQuality;
    int numberOfMovies;
    void displayVideoInfo() {
        System.out.println("Inside Child2 Class: ");
        System.out.println("Video Quality: " + videoQuality);
        System.out.println("Number of Movies: " + numberOfMovies);
    }
}
public class Day10q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MusicStreaming m = new MusicStreaming();
        System.out.println("Enter Service Name: ");
        m.serviceName = input.nextLine();
        System.out.println("Enter Monthly Subscription: ");
        m.monthlySubscription = input.nextInt();
        System.out.println("Enter No.of Songs: ");
        m.numberOfSongs = input.nextInt();
        input.nextLine();
        System.out.println("Enter Offline Download: ");
        m.offlineDownload = input.nextLine();
        if(m.monthlySubscription <=500 ) {
            m.displayServiceInfo();
            m.displayMusicInfo();
        }
        VideoStreaming v = new VideoStreaming();
        System.out.println("Enter Service Name: ");
        v.serviceName = input.nextLine();
        System.out.println("Enter Monthly Subscription: ");
        v.monthlySubscription = input.nextInt();
        System.out.println("Enter Video quality: ");
        v.videoQuality = input.nextInt();
        System.out.println("Enter No.of Movies: ");
        v.numberOfMovies = input.nextInt();
        if(v.monthlySubscription <=500 ) {
            v.displayServiceInfo();
            v.displayVideoInfo();
        }
        input.close();
    }
}
