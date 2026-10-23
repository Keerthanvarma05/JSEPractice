import java.util.Scanner;
interface Printer14 {
    public void printDocument();
}
class LaserPrinter14 implements Printer14 {
    @Override
    public void printDocument() {
        System.out.println("Printing using Laser Printer...");
    }
}
class InkjetPrinter14 implements Printer14 {
    @Override
    public void printDocument() {
        System.out.println("Printing using Inkjet Printer...");
    }
}
public class Day14q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Printer14 printer;
        printer = new LaserPrinter14();
        printer.printDocument();
        printer = new InkjetPrinter14();
        printer.printDocument();
    }
}
