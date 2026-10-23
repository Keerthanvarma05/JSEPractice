import java.util.Scanner;
class Car4{
    String Company;
    String Model;
    int Price;
public Car4(String Company,String Model,int Price){
    this.Company=Company;
    this.Model=Model;
    this.Price=Price;
}
    void displayDetails(){
        System.out.println(this.Company);
        System.out.println(this.Model);
        System.out.println(this.Price);
    }
}
public class Day4q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        Car4[] car=new Car4[n];
        String company;
        String model;
        int price;
        for(int i=0;i< car.length;i++){
            System.out.println("Enter Company Name: ");
            company=input.nextLine();
            System.out.println("Enter Model: ");
            model=input.nextLine();
            System.out.println("Enter Price : ");
            price=input.nextInt();
            input.nextLine();
            car[i]=new Car4(company,model,price);
        }
        for(int i=0;i< car.length;i++){
            car[i].displayDetails();
        }
        System.out.println("Cars with price more than 10 lakhs: \n");
        for(int i=0;i< car.length;i++){
            if(car[i].Price>1000000){
                car[i].displayDetails();
            }
        }
        input.close();
    }
}
