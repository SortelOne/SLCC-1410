public class ShapeApp {

    static Rectangle rect;
    static Circle circ;
    static Square sq;
    static IsoscelesRightTriangle tri;

    public static void main(String[]args){
        rect = new Rectangle(3, 4);
        circ = new Circle(3);
        sq = new Square(4);
        tri = new IsoscelesRightTriangle(3);

        System.out.println(rect);
        System.out.println(circ);
        System.out.println(sq);
        System.out.println(tri);
        System.out.println("Triangle Hypotenouse: " + tri.hypotenuse());
    }
}
