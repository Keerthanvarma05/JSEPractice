import java.util.*;
class Book{
    String title;
    String author;
    int pages;
    void disp(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Pages: "+pages);
    }
}
public class Day1q3
{
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        Book b4 = new Book();
        Book b5 = new Book();
        Scanner sc = new Scanner(System.in);
        //Book1
        System.out.println("Enter title: ");
        b1.title=sc.nextLine();
        System.out.println("Enter author: ");
        b1.author=sc.nextLine();
        System.out.println("Enter pages: ");
        b1.pages=sc.nextInt();
        sc.nextLine();
        //Book2
        System.out.println("Enter title: ");
        b2.title=sc.nextLine();
        System.out.println("Enter author: ");
        b2.author=sc.nextLine();
        System.out.println("Enter pages: ");
        b2.pages=sc.nextInt();
        sc.nextLine();
        //Book3
        System.out.println("Enter title: ");
        b3.title=sc.nextLine();
        System.out.println("Enter author: ");
        b3.author=sc.nextLine();
        System.out.println("Enter pages: ");
        b3.pages=sc.nextInt();
        sc.nextLine();
        //Book4
        System.out.println("Enter title: ");
        b4.title=sc.nextLine();
        System.out.println("Enter author: ");
        b4.author=sc.nextLine();
        System.out.println("Enter pages: ");
        b4.pages=sc.nextInt();
        sc.nextLine();
        //Book5
        System.out.println("Enter title: ");
        b5.title=sc.nextLine();
        System.out.println("Enter author: ");
        b5.author=sc.nextLine();
        System.out.println("Enter pages: ");
        b5.pages=sc.nextInt();
        sc.nextLine();
        sc.close();
        int cnt=0;
        if(b1.pages>300){
            cnt++;
        }
        if(b2.pages>300){
            cnt++;
        }
        if(b3.pages>300){
            cnt++;
        }
        if(b4.pages>300){
            cnt++;
        }
        if(b5.pages>300){
            cnt++;
        }
        System.out.println("Total books with more than 300 pages: "+cnt);
    }
}
