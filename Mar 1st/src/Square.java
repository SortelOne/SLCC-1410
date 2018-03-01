public class Square extends Rectangle {

    private int side;

    public Square(int s){
        side = s;
        //this.Rectangle(s, s);
    }

    @Override
    public String toString(){
        return "Square("+ side+")";
    }
}
