public class Circle implements Shape{

    private int radius;

    public Circle(int r){
        radius = r;
    }

    public int calculateDiameter(){
        return radius*2;
    }

    public double perimeter(){
        return Math.PI * radius * 2;
    }

    public double area(){
        return (Math.PI*radius)*(Math.PI*radius);
    }

    @Override
    public String toString(){
        return "Circle("+ radius +")";
    }
}
