public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int l, int w){
        length = l;
        width = w;
    }

    @Override
    public String toString() {
        return "Rectangle("+ length+"*"+width+")";
    }
}
