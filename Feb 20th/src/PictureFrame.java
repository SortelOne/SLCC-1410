import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PictureFrame extends JFrame implements ActionListener {

    private static JLabel words;
    private static JButton button;
    private static Landscape daLand;
    private static Reptile lizzy;
    private static Bird birb;
    private static Mammal mamimal;
    private ClickableImage ci;

    public PictureFrame(){
        super("Picture Frame");
        this.setBounds(20, 20, 1000, 1000);
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        button = new JButton("Change Image");
        button.setBounds(1000, 0, 200, 50);

        daLand = new Landscape("MountainFall.jpg", "Landscape", this);
        lizzy = new Reptile("alligator.png", "Reptile", this);
        birb = new Bird("owl.png", "Birb", this);
        mamimal = new Mammal("moose.png", "Mammal", this);
        words = new JLabel("Click on an Image!");

        words.setBounds(1100, 100, 200, 200);

        button.addActionListener(this);

        this.add(button);
        this.add(lizzy);
        this.add(birb);
        this.add(mamimal);
        this.add(daLand);
        this.add(words);
        this.setVisible(true);
        repaint();
    }

    public void changeObject(ClickableImage ci){
        this.ci = ci;
        words.setText(ci.getImageName());
    }

    public void actionPerformed(ActionEvent e){
        ci.changeImage();
        this.repaint();
    }
}
