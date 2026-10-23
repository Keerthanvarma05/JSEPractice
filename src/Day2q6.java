import java.util.Scanner;
class Product1{
    String pname;
    int pid;
    int pprice;
    int pquantity;
    Product1(String pname,int pid,int pprice,int pquantity){
        this.pname=pname;
        this.pid=pid;
        this.pprice=pprice;
        this.pquantity=pquantity;
    }
    void disp(){
        System.out.println("Product Name: "+pname);
        System.out.println("Product ID: "+pid);
        System.out.println("Product Price: "+pprice);
        System.out.println("Product Quantity: "+pquantity);
    }
    void totalval(){
        System.out.println("Total value of each product is: "+(pprice*pquantity));
    }
}
public class Day2q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product1 name:");
        String p1name=sc.nextLine();
        System.out.println("Enter the product1 pid:");
        int p1id=sc.nextInt();
        System.out.println("Enter the product1 price:");
        int p1price=sc.nextInt();
        System.out.println("Enter the product1 quantity:");
        int p1quantity=sc.nextInt();
        sc.nextLine();
        Product1 p1=new Product1(p1name,p1id,p1price,p1quantity);
        System.out.println("Enter the product2 name:");
        String p2name=sc.nextLine();
        System.out.println("Enter the product2 pid:");
        int p2id=sc.nextInt();
        System.out.println("Enter the product2 price:");
        int p2price=sc.nextInt();
        System.out.println("Enter the product2 quantity:");
        int p2quantity=sc.nextInt();
        sc.nextLine();
        Product1 p2=new Product1(p2name,p2id,p2price,p2quantity);
        System.out.println("Enter the product3 name:");
        String p3name=sc.nextLine();
        System.out.println("Enter the product3 pid:");
        int p3id=sc.nextInt();
        System.out.println("Enter the product3 price:");
        int p3price=sc.nextInt();
        System.out.println("Enter the product3 quantity:");
        int p3quantity=sc.nextInt();
        sc.nextLine();
        Product1 p3=new Product1(p3name,p3id,p3price,p3quantity);
        System.out.println("Enter the product4 name:");
        String p4name=sc.nextLine();
        System.out.println("Enter the product4 pid:");
        int p4id=sc.nextInt();
        System.out.println("Enter the product4 price:");
        int p4price=sc.nextInt();
        System.out.println("Enter the product4 quantity:");
        int p4quantity=sc.nextInt();
        sc.nextLine();
        Product1 p4=new Product1(p4name,p4id,p4price,p4quantity);
        System.out.println("Enter the product5 name:");
        String p5name=sc.nextLine();
        System.out.println("Enter the product5 pid:");
        int p5id=sc.nextInt();
        System.out.println("Enter the product5 price:");
        int p5price=sc.nextInt();
        System.out.println("Enter the product5 quantity:");
        int p5quantity=sc.nextInt();
        sc.nextLine();
        Product1 p5=new Product1(p5name,p5id,p5price,p5quantity);
        p1.disp();
        p2.disp();
        p3.disp();
        p4.disp();
        p5.disp();
        Product1 highest=p1;
        if(p2.pprice>highest.pprice) {
            highest = p2;
        }else if(p3.pprice>highest.pprice){
            highest=p3;
        }else if(p4.pprice>highest.pprice){
            highest=p4;
        }
        else if(p5.pprice>highest.pprice){
            highest=p5;
        }
        System.out.println("Most expensive product is: ");
        highest.disp();
        p1.totalval();
        p2.totalval();
        p3.totalval();
        p4.totalval();
        p5.totalval();


    }
}
