import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class daNumber extends JComponent {

     public Rectangle topMid;
     public Rectangle midMid;
     public Rectangle botMid;
     public Rectangle topLeft;
     public Rectangle botLeft;
     public Rectangle topRight;
     public Rectangle botRight;

     public daNumber(int x, int y, int v){
         super();
         this.setBounds(x, y, 100, 100);

         topLeft = new Rectangle (0, 0, 20, 50);
         botLeft = new Rectangle (0, 40, 20, 50);
         botMid = new Rectangle ( 0, 80, 60, 20);
         topMid = new Rectangle (0, 0, 60, 20);
         midMid = new Rectangle(0, 40, 60, 20);
         topRight = new Rectangle(40, 0, 20, 50);
         botRight = new Rectangle(40, 40, 20, 60);

         this.add(topMid);
         this.add(midMid);
         this.add(botMid);
         this.add(topLeft);
         this.add(botLeft);
         this.add(topRight);
         this.add(botRight);

         Random gen = new Random();
         int r = gen.nextInt(255);
         int g = gen.nextInt(255);
         int b = gen.nextInt(255);
         Color color = new Color(r,g,b);
         setColor(color);
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

     protected void setColor(Color color){
         topLeft.setBackground(color);
         midMid.setBackground(color);
         botMid.setBackground(color);
         topMid.setBackground(color);
         botLeft.setBackground(color);
         topRight.setBackground(color);
         botRight.setBackground(color);
         repaint();
     }

    //public boolean equals(Object n){
    //     if(n == null)
    //         return false;
    //     if(n == this)
    //         return true;
    //     if(n instanceof Number){
    //         return n.value == this.value;
    //     }
    //     else
    //         return false;
    //}

     public static void main(String[]args){
     }
}
