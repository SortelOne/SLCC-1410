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

     public daNumber(int x, int y){
         super();
         this.setBounds(x, y, 70, 100);

         topMid = new Rectangle (0, 0, 20, 50);
         midMid = new Rectangle (40, 0, 20, 50);
         botMid = new Rectangle ( 80, 0, 20, 50);
         topLeft = new Rectangle (0, 0, 50, 20);
         botLeft = new Rectangle(60, 0, 50, 20);
         topRight = new Rectangle(0, 50, 20, 50);
         botRight = new Rectangle(50, 50, 20, 50);

         this.add(topMid);
         this.add(midMid);
         this.add(botMid);
         this.add(topLeft);
         this.add(botLeft);
         this.add(topRight);
         this.add(botRight);
     }

     public static void main(String[]args){

     }
}
