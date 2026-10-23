import java.util.Scanner;
class FoodOrder5{
    String Restaurant_Name="Domino's";
    String Food_Item="Margherita Pizza";
    int Quantity=1;
    int Price=299;
    public FoodOrder5(){
        System.out.println("Inside zero Parameterized constructor: ");
    }
    public FoodOrder5(String Restaurant_Name,String Food_Item){
        System.out.println("Inside two Parameterized constructor: ");
        this.Restaurant_Name = Restaurant_Name;
        this.Food_Item = Food_Item;
    }
    public FoodOrder5(String Restaurant_Name, String Food_Item, int Quantity, int Price) {
        System.out.println("Inside multiple Parameterized constructor: ");
        this.Restaurant_Name = Restaurant_Name;
        this.Food_Item = Food_Item;
        this.Quantity = Quantity;
        this.Price = Price;
    }
    void display(){
        System.out.println("Restaurant Name: "+Restaurant_Name);
        System.out.println("Food Item: "+Food_Item);
        System.out.println("Quantity: "+Quantity);
        System.out.println("Price: "+Price);
        int Total_Amount = Quantity*Price;
        System.out.println("Total Amount: "+Total_Amount);
    }
}

public class Day5q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodOrder5 food1 = new FoodOrder5();
        food1.display();

        System.out.println("Enter the Restaurant Name: ");
        String Restaurant_Name2 = sc.nextLine();
        System.out.println("Enter the Food Item: ");
        String Food_Item2 = sc.nextLine();
        FoodOrder5 food2 = new FoodOrder5(Restaurant_Name2, Food_Item2);
        food2.display();

        System.out.println("Enter the Restaurant Name: ");
        String Restaurant_Name3 = sc.nextLine();
        System.out.println("Enter the Food Item: ");
        String Food_Item3 = sc.nextLine();
        System.out.println("Enter the Quantity: ");
        int Quantity3 = sc.nextInt();
        System.out.println("Enter the Price: ");
        int Price3 = sc.nextInt();
        FoodOrder5 food3 = new FoodOrder5(Restaurant_Name3, Food_Item3, Quantity3, Price3);
        food3.display();
    }
}