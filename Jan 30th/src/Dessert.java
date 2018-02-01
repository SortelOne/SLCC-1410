import java.util.ArrayList;
import java.util.Scanner;

public abstract class Dessert {

    private String flavors;
    private ArrayList <String> ingredients;
    private boolean stored;

    Scanner scan = new Scanner(System.in);

    public Dessert(String f){
        flavors = f;

        setIngredients(this);
        stored = false;
    }

    public abstract void prepare();

    public abstract void create();

    public abstract void finish();

    public abstract void store();

    public String toString(){
        return "The dessert you've created is " + " and stuff";

    }


    public void setIngredients(Dessert d){
        boolean done = false;

        while(!done){
            if(d instanceof Cake){
                System.out.println("What would you like to add to your cake? Type done to be done.");
                do{
                    ingredients;
                    System.out.println("Add more or type done");
                }while(ingre != ("done"));
                System.out.println("The ingredients you added were " + getIngredients(ingre) + " and they were delicious.");
            }
            else if(d instanceof IceCream){

            }
        }
    }



    public ArrayList getIngredients(ArrayList<String> i){
        return i;
    }
}
