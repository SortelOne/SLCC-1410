import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        //Instantiate all the desserts, put them in an arraylist and call a tostring with them in it
        Dessert Pies = new Pie("chocolate", 25);
        Dessert Cookiesss = new Cookies("Chocolate Chip", 3);
        Dessert IceCreams = new IceCream("Vanilla", true);
        Dessert Cakes = new Cake("Vanilla", 10);

        ArrayList <Dessert> todoLosDesserts = new ArrayList <Dessert>();

        todoLosDesserts.add(Pies);
        todoLosDesserts.add(Cakes);
        todoLosDesserts.add(Cookiesss);
        todoLosDesserts.add(IceCreams);

        for(Dessert d:todoLosDesserts){
            d.prepare();
            d.create();
            d.finish();
            d.store();
            System.out.println(d);
        }
    }
}
