import javax.swing.*;
import java.util.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cJFrame extends JFrame implements ActionListener {

    private static JButton button;
    private static JButton idle;
    private static JButton firstUpgrade;
    private static JButton secUpgrade;
    private static JButton thirdUpgrade;

    public static JLabel numCount;
    public static int count;
    public static int click = 1;
    public static int tierOne = 1;
    public static int tierTwo = 50;
    public static int tierThree = 1000;
    public static int idleCost = 2;

    public static int timeStone = 1000000;

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

        firstUpgrade = new JButton("Level One");
        firstUpgrade.setBounds(400, 80, 100, 50);

        secUpgrade = new JButton("Level Two");
        secUpgrade.setBounds(400, 140, 100, 50);

        thirdUpgrade = new JButton("Level Three");
        thirdUpgrade.setBounds(400, 200, 100, 50);

        this.add(button);
        this.add(idle);
        this.add(firstUpgrade);
        this.add(secUpgrade);
        this.add(thirdUpgrade);
        this.add(twoDigits);

        button.addActionListener(this);
        idle.addActionListener(this);
        firstUpgrade.addActionListener(this);
        secUpgrade.addActionListener(this);
        thirdUpgrade.addActionListener(this);

        String klesor = String.valueOf(count);
        numCount = new JLabel(klesor);
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
            numCount.setText(String.valueOf(count));
        }
        else if(e.getSource() == idle) {
            if(count>idleCost){
                twoDigits.buyIdle();
            }
            else{
                System.out.println("You only have " + count + " points.\nGet " + idleCost + " to level up.");
            }
        }
        else if(e.getSource() == firstUpgrade){
            if(count>tierOne){
                twoDigits.multiplier();
            }
            else{
                System.out.println("You only have " + count + " points.\nGet " + tierOne + " to level up.");
            }
        }
        if(e.getSource() == secUpgrade){
            if(count>tierTwo){
                twoDigits.secUpg();
            }
            else{
                System.out.println("You only have " + count + " points.\nGet " + tierTwo + " to level up.");
            }
        }
        if(e.getSource() == thirdUpgrade){
            if(count>tierThree){
                twoDigits.thirdUpg();
            }
            else{
                System.out.println("You only have " + count + " points.\nGet " + tierThree + " to level up.");
            }
        }
    }

}