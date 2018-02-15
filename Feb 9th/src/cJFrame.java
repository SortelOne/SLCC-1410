import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cJFrame extends JFrame implements ActionListener {

    private static JButton button;
    private static JButton reset;
    private static JButton colors;
    static Counter  counter;
    static int x;
    static Driver twoDigits;

    public cJFrame(){
        super("Clicker Counter");
        this.setBounds(20, 20, 1000, 1000);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        x = 0;

        twoDigits = new Driver();

        button = new JButton("Click here to add one");
        button.setBounds(0, 0, 100, 100);

        reset = new JButton("Reset");
        reset.setBounds(200, 0, 100, 100);

        colors = new JButton("Change Colors");
        colors.setBounds(100, 0, 100, 100);

        this.add(button);
        this.add(reset);
        this.add(colors);
        this.add(twoDigits);

        button.addActionListener(this);

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button)
            twoDigits.numChange();
        else if(e.getSource() == reset)
            twoDigits.setZero();
        else if(e.getSource() == colors)
            twoDigits.setColor();
    }

}