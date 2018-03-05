public class Rectangle implements Shape, Printable{

    private int length;
    private int width;

    public Rectangle(int l, int w){
        length = l;
        width = w;
    }

    public double area(){
        return length*width;
    }

    public double perimeter(){
        return (length*2)+(width*2);
    }

    public void print(){
        int len = 0;
        do{
            System.out.println("*");
            len++;
        }while(len<=length);

        System.out.println("*     *");
        len = 0;

        do{
            System.out.println("*");
            len++;
        }while(len<=length);
    }

    @Override
    public String toString() {
        return "Rectangle("+ length+" x "+width+")";
    }
}
