import java.util.*;
class Book1{
    String title;
    String author;
    int price;
    Book1(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void disp(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
public class Day2q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1's Book title : ");
        String b1title=sc.nextLine();
        System.out.println("Enter 1's Book author : ");
        String b1author=sc.nextLine();
        System.out.println("Enter 1's Book price : ");
        int b1price=sc.nextInt();
        sc.nextLine();
        Book1 b1=new Book1(b1title,b1author,b1price);
        System.out.println("Enter 2's Book title : ");
        String b2title=sc.nextLine();
        System.out.println("Enter 2's Book author : ");
        String b2author=sc.nextLine();
        System.out.println("Enter 2's Book price : ");
        int b2price=sc.nextInt();
        sc.nextLine();
        Book1 b2=new Book1(b2title,b2author,b2price);
        System.out.println("Enter 3's Book title : ");
        String b3title=sc.nextLine();
        System.out.println("Enter 3's Book author : ");
        String b3author=sc.nextLine();
        System.out.println("Enter 3's Book price : ");
        int b3price=sc.nextInt();
        sc.nextLine();
        Book1 b3=new Book1(b3title,b3author,b3price);
        b1.disp();
        b2.disp();
        b3.disp();
    }
}
