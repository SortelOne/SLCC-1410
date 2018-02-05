public class Pie extends Dessert {

    int storageTemp;

    public Pie(String f, int t){
        super (f);
        storageTemp = t;
    }

    public void prepare(){
        System.out.println("You prepared the pie.");
    }

    public void create(){
        System.out.println("You created the pie.");
    }

    public void finish(){
        System.out.println("You finished the pie.");
    }

    public void store(){
        System.out.println("You stored the pie at " + storageTemp + " degrees fahrenheit");
    }

    public String toString(){
        return "The dessert you've created is a pie and you stored it at " + storageTemp + " and stuff.";

    }
}
