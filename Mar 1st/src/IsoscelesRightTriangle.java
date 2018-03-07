public class IsoscelesRightTriangle implements Shape, Printable{

    private final int leg;

    public IsoscelesRightTriangle(int l){
        leg = l;
    }

    public double area(){
        return .5*(leg*leg);
    }

    public double perimeter(){
        return (leg+leg)+(Math.sqrt((leg^2)*(leg^2)));
    }

    public void print(){
        System.out.println("*");
        System.out.println("* *");
        System.out.println("*  *");
        System.out.println("*   *");
        System.out.println("*    *");
        System.out.println("*******");
    }

    public double hypotenuse(){
        return Math.sqrt((leg^2)*(leg^2));
    }

    @Override
    public String toString() {
        return "IsoscelesRightTriangle("+leg+")";
    }
}
