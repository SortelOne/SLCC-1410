public class Circle {

    private int radius;

    public Circle(int r){
        radius = r;
    }

    public void circumference(){
        Math.PI * radius * 2;
    }

    @Override
    public String toString(){
        return "Circle("+ radius +")";
    }
}
