class Transport12 {
    String company;
    String route;
    void travel() {
        System.out.println("Travelling by transport...");
    }
}
class Train12 extends Transport12 {
    @Override
    void travel() {
        System.out.println("Travelling by train...");
    }
}
public class Day12q1 {
    public static void main(String[] args) {
        Transport12 transport = new Transport12();
        transport.travel();
        Train12 train = new Train12();
        train.travel();
    }
}
