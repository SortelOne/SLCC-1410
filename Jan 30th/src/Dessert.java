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
        Scanner scan = new Scanner(System.in);
        String ingre = "";

        while(!ingre.equalsIgnoreCase ("done")){
            if(d instanceof Cake){
                System.out.println("What would you like to add to your cake? Type done to be done.");
            }
            else if(d instanceof IceCream){
                System.out.println("What would you like to add to your Ice Cream? Type done to be done.");
            }
            else if(d instanceof Cookies){
                System.out.println("What would you like to add to your cookies? Type done to be done.");
            }
            else if(d instanceof Pie){
                System.out.println("What would you like to add to your pie? Type done to be done.");
            }

            ingredients = new ArrayList<String>();

            ingre = scan.nextLine();
            ingredients.add(ingre);
            System.out.println("Add more or type done");

            if(ingre.equalsIgnoreCase("done")){

            }else{
                ingredients.add(ingre);
                System.out.println("The ingredients you added were " + ingre + " and they were delicious.");
            }
        }
    }



    public ArrayList getIngredients(ArrayList<String> i){
        return i;
    }
}
