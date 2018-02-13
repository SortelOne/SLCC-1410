import javax.swing.*;

public class Driver extends JFrame {

    public static JButton sean;
    public static Counter counter1;
    public static Counter counter2;

    public Driver(){
        super("Two Buttons?");
        this.setBounds(20, 20, 1000, 1000);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        counter1 = new Counter();
        counter2 = new Counter();





        this.setVisible(true);
    }
}
