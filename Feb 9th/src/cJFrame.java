import javax.swing.*;

public class cJFrame extends JFrame{

    private static JButton button;
    private static JButton reset;
    static Counter  counter;
    private static Number digit;
    private static Number digit2;
    static int x;

    public cJFrame(){
        super("Clicker Counter");
        this.setBounds(20, 20, 1000, 1000);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        x = 0;

        counter = new Counter();

        digit = new Number(100, 100, x);
        digit2 = new Number(40, 100, x);

        button = new JButton("Click here to add one");
        button.setBounds(0, 0, 100, 100);

        reset = new JButton("Reset");
        reset.setBounds(200, 0, 100, 100);

        this.add(button);
        this.add(reset);
        this.add(digit);
        this.add(digit2);

        button.addActionListener(counter);

        this.setVisible(true);
    }

    public static void numChange(){
        x++;
        digit.setValue(x%10);
        digit2.setValue(x/10);
        if(x==99) {
            x = -1;
        }
    }
}