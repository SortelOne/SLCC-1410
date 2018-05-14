import javax.swing.*;
import java.util.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cJFrame extends JFrame implements ActionListener {

    private static JButton button;
    private static JButton idle;
    private static JButton multiplier;
    public static int count;
    public static int click;
    private static int multiplierInt;
    private static int idleNum;
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

        button = new JButton("CLICK FURY");
        button.setBounds(0, 0, 100, 100);

        idle = new JButton("Idle");
        idle.setBounds(400, 20, 100, 50);

        multiplier = new JButton("2X");
        multiplier.setBounds(400, 80, 100, 50);

        this.add(button);
        this.add(idle);
        this.add(multiplier);
        this.add(twoDigits);

        button.addActionListener(this);
        idle.addActionListener(this);
        multiplier.addActionListener(this);

        String klesor = String.valueOf(count);
        JLabel numCount = new JLabel(klesor);
        numCount.setBounds(200, 200, 200, 200);
        numCount.setVisible(true);
        this.add(numCount);

        //timer
        Timer seconds = new Timer();
        seconds.schedule(new timerStuff(), 0, 1000);

        this.setVisible(true);


    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button) {
            twoDigits.numChange();
            count = count+click;
            System.out.println(x);
            repaint();
        }
        else if(e.getSource() == idle) {
            twoDigits.buyIdle();
            idleNum++;
        }
        else if(e.getSource() == multiplier){
            click = click*2;
            multiplierInt++;
        }
    }

}