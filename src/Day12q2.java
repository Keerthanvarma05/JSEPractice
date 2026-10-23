class Shape12 {
    void draw() {
        System.out.println("Drawing Shape...");
    }
}
class Circle12 extends Shape12 {

    @Override
    void draw() {
        System.out.println("Drawing Circle...");
    }
}
class Rectangle12 extends Shape12 {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle...");
    }
}
public class Day12q2 {
    public static void main(String[] args) {
        Shape12 s1 = new Circle12();
        Shape12 s2 = new Rectangle12();
        s1.draw();
        s2.draw();
    }
}
