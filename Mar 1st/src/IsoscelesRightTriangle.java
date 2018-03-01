public class IsoscelesRightTriangle {

    private final int leg;

    public IsoscelesRightTriangle(int l){
        leg = l;
    }

    public double hypotenuse(){
        return Math.sqrt((leg^2)*(leg^2));
    }

    @Override
    public String toString() {
        return "IsoscelesRightTriangle("+leg+")";
    }
}
