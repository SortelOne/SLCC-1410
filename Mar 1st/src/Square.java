public class Square extends Rectangle{

    public int side;

    public Square(int s){
        super(s, s);
        side = s;
        //this.Rectangle(s, s);
    }

    @Override
    public String toString(){
        return "Square("+ side+")";
    }
}
