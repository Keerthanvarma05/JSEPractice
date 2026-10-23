import java.util.Scanner;
class Smartwatch
{
    private String brand;
    private String model;
    private int batteryPercentage;
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public void setBatteryPercentage(int batteryPercentage)
    {
        this.batteryPercentage = batteryPercentage;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getModel()
    {
        return model;
    }
    public int getBatteryPercentage()
    {
        return batteryPercentage;
    }
}
public class Day6q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the Brand :");
        String brand = input.nextLine();
        System.out.println("Enter the name of the Model :");
        String model = input.nextLine();
        System.out.println("Enter the BatteryPercentage :");
        int batteryPercentage = input.nextInt();
        Smartwatch smartwatch = new Smartwatch();
        smartwatch.setBrand(brand);
        smartwatch.setModel(model);
        smartwatch.setBatteryPercentage(batteryPercentage);
        System.out.println("Brand: "+smartwatch.getBrand());
        System.out.println("Model: "+smartwatch.getModel());
        System.out.println("Batterypercentage: "+smartwatch.getBatteryPercentage());
    }
}


