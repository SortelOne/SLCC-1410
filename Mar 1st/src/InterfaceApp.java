import java.awt.*;

public class InterfaceApp {

    static Rectangle rect;
    static Square sq;
    static Circle circ;
    static IsoscelesRightTriangle tri;
    static Shape[] shapies;

    public static void main(String[]args){
        rect = new Rectangle(6, 3);
        sq = new Square(5);
        circ = new Circle(5);
        tri = new IsoscelesRightTriangle(6);
        shapies = new Shape[4];

        System.out.println("Shape Array:");
        System.out.println("------------");
        System.out.println(rect.toString());
        System.out.println(rect.print());
        System.out.println(sq.toString());
        System.out.println(circ.toString());
        System.out.println(circ.circumference());
        System.out.println("Diameter: " + circ.calculateDiameter());
        System.out.println(tri.toString());
        System.out.println(tri.hypotenuse());
    }
}
