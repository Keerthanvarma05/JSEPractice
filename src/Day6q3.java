import java.util.Scanner;
class Songs{
    private String Song_Name;
    private String Singer;
    private float Duration;

    public String getSong_Name() {
        return Song_Name;
    }

    public void setSong_Name(String song_Name) {
        this.Song_Name = song_Name;
    }

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String singer) {
        this.Singer = singer;
    }

    public float getDuration() {
        return Duration;
    }

    public void setDuration(float duration) {
        this.Duration = duration;
    }

}
public class Day6q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=3;
        Songs[] songs = new Songs[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter Song Name: ");
            String Song_Name = input.nextLine();
            System.out.printf("Enter Singer: ");
            String Singer = input.nextLine();
            System.out.printf("Enter Duration: ");
            float Duration = input.nextFloat();
            input.nextLine();
            songs[i]=new Songs();
            songs[i].setSong_Name(Song_Name);
            songs[i].setSinger(Singer);
            songs[i].setDuration(Duration);
            if(songs[i].getDuration()>4){
                System.out.println("Song name: "+songs[i].getSong_Name());
                System.out.println("Singer name: "+songs[i].getSinger());
                System.out.println("Duration: "+songs[i].getDuration());
            }else{
                System.out.println("Song is short.");
            }
        }
        input.close();
    }
}
