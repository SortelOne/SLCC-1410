public class Cake extends Dessert {

    String shape;

    int numOfSides;

    public Cake(String f, int n){
        super(f);
        numOfSides = n;
    }

    public void prepare(){
        System.out.println("You prepared the Cake.");
    }

    public void create(){
        System.out.println("You created the Cake.");
    }

    public void finish(){
        System.out.println("You finished the Cake.");
    }

    public void store(){
        System.out.println("You stored the cake that has " + numOfSides + " sides.");
    }

    public String toString(){
        return "The dessert you've created is a cake and stuff";

    }
}
