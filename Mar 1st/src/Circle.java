public class Circle {

    private int radius;

    public Circle(int r){
        radius = r;
    }

    public int calculateDiameter(){
        return radius*2;
    }

    public double circumference(){
        return Math.PI * radius * 2;
    }

    @Override
    public String toString(){
        return "Circle("+ radius +")";
    }
}
