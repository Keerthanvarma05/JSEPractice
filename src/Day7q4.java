import java.util.Scanner;
class CartItems{
    private String ProductName;
    private String Category;
    private int Price;
    private int Quantity;

    public CartItems(){
        System.out.println("Default sonstructor");
    }
    public CartItems(String ProductName, String Category, int Price, int Quantity){
        this.ProductName = ProductName;
        this.Category = Category;
        this.Price = Price;
        this.Quantity = Quantity;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getCategory() {
        return Category;
    }

    public int getPrice() {
        return Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    int calculateTotalPrice(){
        return Price*Quantity;
    }

    void displayItemDetails(){
        System.out.println("Product Name: "+ProductName);
        System.out.println("Category: "+Category);
        System.out.println("Price: "+Price);
        System.out.println("Quantity: "+Quantity);
        System.out.println("Total Price: "+calculateTotalPrice());
    }
}
public class Day7q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=4;
        CartItems [] ci=new CartItems[n];
        for(int i=0;i<ci.length;i++){
            System.out.println("Enter Product Name: ");
            String ProductName=sc.nextLine();
            System.out.println("Enter Category: ");
            String Category=sc.nextLine();
            System.out.println("Enter Price: ");
            int Price=sc.nextInt();
            System.out.println("Enter Quantity: ");
            int Quantity=sc.nextInt();
            sc.nextLine();
            ci[i] = new CartItems(ProductName, Category, Price, Quantity);
            ci[i].displayItemDetails();
        }
        CartItems highest=ci[0];
        for(int i=1;i<ci.length;i++){
            if(highest.getPrice()<ci[i].getPrice()){
                highest=ci[i];
            }
        }
        System.out.println("Most Expensive product: ");
        highest.displayItemDetails();

        int totalcartval=0;
        for(int j=0;j<ci.length;j++){
            int val=ci[j].calculateTotalPrice();
            totalcartval+=val;
        }
        System.out.println("Total cart value: "+totalcartval);
        sc.close();
    }
}
