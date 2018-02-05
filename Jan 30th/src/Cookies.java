public class Cookies extends Dessert {

    int size = 1;

    public Cookies(String f, int s){
        super (f);
        size = s;
    }

    public void prepare(){
        System.out.println("You prepared the cookies.");
    }

    public void create(){
        System.out.println("You created the cookies.");
    }

    public void finish(){
        System.out.println("You finished the cookies.");
    }

    public void store(){
        System.out.println("You stored the cookies");
    }

    public String toString(){
        return "The dessert you've created is cookies of size " + size + " and stuff";

    }
}
