import javax.swing.*;
import java.awt.event.*;

public class PictureButton extends JFrame implements ActionListener{

    private JButton imgButton;
    private Icon clickImage;
    private Icon clickImage2;

    public PictureButton(){
        super("Picture Button");
        //this.setLayout(null);
        this.setBounds(20,20,1000,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //This code makes the pictures
        Icon image1 = new ImageIcon(getClass().getResource("Image1.png"));
        Icon image2 = new ImageIcon(getClass().getResource("Image2.png"));
        clickImage = new ImageIcon(getClass().getResource("SALUTEPIGEON.gif"));
        clickImage2 = new ImageIcon(getClass().getResource("TrashDove.gif"));

        //This code makes the button
        imgButton = new JButton(image1);
        imgButton.setBounds(0, 0, 1000, 1000);

        this.add(imgButton, 0);
        imgButton.addActionListener(this);
        imgButton.setRolloverIcon(image2);
        add(imgButton);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(imgButton.getIcon().equals(clickImage)){
            imgButton.setIcon(clickImage2);
        }
        else{
            imgButton.setIcon(clickImage);
        }
        imgButton.setRolloverEnabled(false);
    }
}
