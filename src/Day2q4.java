import java.util.*;
class Mobile1{
    String brand;
    String model;
    int price;
    Mobile1(String brand,String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    void disp(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }
}
public class Day2q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mobile1 brand: ");
        String m1brand=sc.nextLine();
        System.out.println("Enter mobile1 model: ");
        String m1model=sc.nextLine();
        System.out.println("Enter mobile1 price: ");
        int m1price=sc.nextInt();
        sc.nextLine();
        Mobile1 m1=new Mobile1(m1brand,m1model,m1price);
        System.out.println("Enter mobile2 brand: ");
        String m2brand=sc.nextLine();
        System.out.println("Enter mobile2 model: ");
        String m2model=sc.nextLine();
        System.out.println("Enter mobile2 price: ");
        int m2price=sc.nextInt();
        sc.nextLine();
        Mobile1 m2=new Mobile1(m2brand,m2model,m2price);
        System.out.println("Enter mobile3 brand: ");
        String m3brand=sc.nextLine();
        System.out.println("Enter mobile3 model: ");
        String m3model=sc.nextLine();
        System.out.println("Enter mobile3 price: ");
        int m3price=sc.nextInt();
        sc.nextLine();
        Mobile1 m3=new Mobile1(m3brand,m3model,m3price);
        System.out.println("Enter mobile4 brand: ");
        String m4brand=sc.nextLine();
        System.out.println("Enter mobile4 model: ");
        String m4model=sc.nextLine();
        System.out.println("Enter mobile4 price: ");
        int m4price=sc.nextInt();
        sc.nextLine();
        Mobile1 m4=new Mobile1(m4brand,m4model,m4price);
        m1.disp();
        m2.disp();
        m3.disp();
        m4.disp();
        int cnt=0;
        if(m1.price>30000){
            cnt++;
            m1.disp();
        }
        if(m2.price>30000){
            cnt++;
            m2.disp();
        }
        if(m3.price>30000){
            cnt++;
            m3.disp();
        }
        if(m4.price>30000){
            cnt++;
            m4.disp();
        }
        System.out.println("No.of Mobiles priced more than 30000: "+cnt);
    }
}
