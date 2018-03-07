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

        shapies[0] = sq;
        shapies[1] = rect;
        shapies[2] = tri;
        shapies[3] = circ;

        System.out.println("Shape Array:");
        System.out.println("------------");

        for(Shape s:shapies){
            System.out.println(s);
            System.out.println("Perimeter is: " + s.perimeter());
            System.out.println("Area is: " + s.area());
            if(s instanceof Printable){
                ((Printable) s).print();
            }
            System.out.println("");
        }
    }
}
