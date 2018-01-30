import java.util.ArrayList;
import java.util.Scanner;

public class Dessert {

    private String flavors;
    private ArrayList <String> ingredients;
    private boolean stored;

    Scanner scan = new Scanner(System.in);

    public Dessert(String f){
        flavors = f;

        setIngredients();
        stored = false;
    }

    public static void setIngredients(){

    }

    public ArrayList getIngredients(ArrayList<String> i){
        ingredients = i;
        return i;
    }

    public void finish(){

    }
}
