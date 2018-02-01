import javax.swing.*;
import java.util.Random;

public class ranColors{

    public static void main(String[]args){
        int times = 0;
        int x = 0;
        int y = 0;
        int i = 0;
        JFrame frame = new JFrame("RYAN");
        frame.setBounds(10, 10, 1500, 1500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Random gen = new Random();
        for(i = 0; i<=10; i++){
            x = gen.nextInt(1000);
            y = gen.nextInt(1000);
            frame.add(new Number(x, y, i));
            times++;
        }
        frame.setVisible(true);
    }
}
