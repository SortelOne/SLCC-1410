import javax.swing.*;
import java.awt.*;

public class daNumber extends JComponent {

     public Rectangle topMid;
     public Rectangle midMid;
     public Rectangle botMid;
     public Rectangle topLeft;
     public Rectangle botLeft;
     public Rectangle topRight;
     public Rectangle botRight;

     public daNumber(int x, int y, String value){
         super();
         this.setBounds(x, y, 50, 50);

         topLeft = new Rectangle (0, 0, 20, 50);
         botLeft = new Rectangle (0, 40, 20, 50);
         botMid = new Rectangle ( 0, 80, 60, 20);
         topMid = new Rectangle (0, 0, 60, 20);
         midMid = new Rectangle(0, 40, 60, 20);
         topRight = new Rectangle(40, 0, 20, 50);
         botRight = new Rectangle(40, 40, 20, 50);

         this.add(topMid);
         this.add(midMid);
         this.add(botMid);
         this.add(topLeft);
         this.add(botLeft);
         this.add(topRight);
         this.add(botRight);

         //"value"();
     }

     //public int getNumber(){
     //    return
     //}

     protected void all(){
         topLeft.setVisible(true);
         midMid.setVisible(true);
         botMid.setVisible(true);
         topMid.setVisible(true);
         botLeft.setVisible(true);
         topRight.setVisible(true);
         botRight.setVisible(true);
         repaint();
     }

     protected void none(){
         topLeft.setVisible(false);
         midMid.setVisible(false);
         botMid.setVisible(false);
         topMid.setVisible(false);
         botLeft.setVisible(false);
         topRight.setVisible(false);
         botRight.setVisible(false);
         repaint();
     }

    protected void one() {
        topLeft.setVisible(false);
        midMid.setVisible(false);
        botMid.setVisible(false);
        topMid.setVisible(false);
        botLeft.setVisible(false);
        topRight.setVisible(true);
        botRight.setVisible(true);
        repaint();
    }

    protected void two() {
        topLeft.setVisible(false);
        midMid.setVisible(true);
        botMid.setVisible(true);
        topMid.setVisible(true);
        botLeft.setVisible(true);
        topRight.setVisible(true);
        botRight.setVisible(false);
        repaint();
    }

    protected void three() {
        topLeft.setVisible(false);
        midMid.setVisible(true);
        botMid.setVisible(true);
        topMid.setVisible(true);
        botLeft.setVisible(false);
        topRight.setVisible(true);
        botRight.setVisible(true);
        repaint();
    }

    protected void four() {
        topLeft.setVisible(true);
        midMid.setVisible(true);
        botMid.setVisible(false);
        topMid.setVisible(false);
        botLeft.setVisible(false);
        topRight.setVisible(true);
        botRight.setVisible(true);
        repaint();
    }

    protected void five() {
        topLeft.setVisible(true);
        midMid.setVisible(true);
        botMid.setVisible(true);
        topMid.setVisible(true);
        botLeft.setVisible(false);
        topRight.setVisible(false);
        botRight.setVisible(true);
        repaint();
    }

    protected void six() {
        topLeft.setVisible(false);
        midMid.setVisible(false);
        botMid.setVisible(false);
        topMid.setVisible(false);
        botLeft.setVisible(false);
        topRight.setVisible(true);
        botRight.setVisible(true);
        repaint();
    }

    public boolean equals(Object n){
         if(n == null)
             return false;
         if(n == this)
             return true;
         if(n instanceof Number){
             return n.value == this.value;
         }
         else
             return false;
    }

     public static void main(String[]args){
     }
}
