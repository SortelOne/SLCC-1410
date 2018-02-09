import javax.swing.*;

public class cJFrame extends JFrame{

    private static JButton button;
    private static JButton reset;
    static Counter  counter;

    public cJFrame(){
        super("Clicker Counter");
        this.setBounds(20, 20, 1000, 1000);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        counter = new Counter();

        button = new JButton(""+counter.getCount());
        button.setBounds(0, 0, 100, 100);

        reset = new JButton("Reset");
        reset.setBounds(200, 0, 100, 100);

        this.add(button);
        this.add(reset);

        button.addActionListener(counter);

        this.setVisible(true);
    }

    public static void numChange(){
        button.setText(""+counter.getCount());
    }
}