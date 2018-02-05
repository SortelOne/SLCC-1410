public class IceCream extends Dessert {

    boolean softServe;

    public IceCream(String f, boolean s){
        super (f);
        softServe = s;
    }

    public void prepare(){
        System.out.println("You prepared the Ice Cream.");
    }

    public void create(){
        System.out.println("You created the Ice Cream.");
    }

    public void finish(){
        System.out.println("You finished the Ice Cream.");
    }

    public void store(){
        System.out.println("You stored the IceCream.");
    }

    public String toString(){
        return "The dessert you've created is Ice Cream and stuff";

    }
}
