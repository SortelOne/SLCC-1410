import javax.swing.*;
import java.util.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cJFrame extends JFrame implements ActionListener {

    private static JButton button;
    private static JButton idle;
    private static JButton multiplier;
    public static int count;
    public static int click = 1;
    public static int multiplierCost = 1;
    private static int idleCost = 1;
    static Driver twoDigits;

    public cJFrame(){
        super("Clicker Counter");
        this.setBounds(20, 20, 1000, 1000);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
            count = count+(click);
            System.out.println(count);
        }
        else if(e.getSource() == idle) {
            if(count>idleCost){
                twoDigits.buyIdle();
                System.out.println("Congrats! You bought more Idle!");
                count = count - idleCost;
                idleCost = (idleCost*idleCost) + idleCost;
                System.out.println("You now have " + count + " points and you need " + idleCost + ".");
            }
            else{
                System.out.println("You only have " + count + " points.\nGet " + idleCost + " to level up.");
            }
        }
        else if(e.getSource() == multiplier){
            if(count>multiplierCost){
                click = click*2;
                System.out.println("Congrats! You bought a Multiplier!");
                count = count - multiplierCost;
                multiplierCost = (multiplierCost*multiplierCost) + multiplierCost;
                System.out.println("You now have " + count + " points and you need " + multiplierCost + ".");
            }
            else{
                System.out.println("You only have " + count + " points.\nGet " + multiplierCost + " to level up.");
            }
        }
    }

}