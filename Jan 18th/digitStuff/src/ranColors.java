import javax.swing.*;
import java.util.Random;

public class ranColors{

    public static void main(String[]args){
        int times = 0;
        int x = 0;
        int y = 0;
        int v = 0;
        JFrame frame = new JFrame("RYAN");
        frame.setBounds(10, 10, 1500, 1500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Random gen = new Random();
        do{
            v = gen.nextInt(9);
            x = gen.nextInt(1000);
            y = gen.nextInt(1000);
            frame.add(new Number(x, y, v));
            times++;
        }while(times<=10);
        frame.setVisible(true);
    }
}
