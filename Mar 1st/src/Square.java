public class Square extends Rectangle implements Shape, Printable{

    public int side;

    public Square(int s){
        super(s, s);
        side = s;
        //this.Rectangle(s, s);
    }

    public double area(){
        return side*side;
    }

    public void print(){
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*****");
    }

    @Override
    public String toString(){
        return "Square("+ side+")";
    }
}
