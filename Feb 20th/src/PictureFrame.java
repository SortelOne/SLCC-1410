import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PictureFrame extends JFrame implements ActionListener {

    private static JButton button;
    private static Landscape daLand;
    private static Reptile lizzy;
    private static Bird birb;
    private static Mammal mamimal;

    public PictureFrame(){
        super("Picture Frame");
        this.setBounds(20, 20, 1000, 1000);
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        button = new JButton("Change Image");
        button.setBounds(1000, 0, 200, 50);

        daLand = new Landscape("MountainFall.jpg", "landscape", this);
        lizzy = new Reptile("alligator.png", "reptile", this);
        birb = new Bird("owl.png", "birb", this);

        this.add(button);

        this.add(lizzy);
        this.add(birb);
        this.add(daLand);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

    }
}
