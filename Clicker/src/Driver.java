import javax.swing.*;

public class Driver extends JComponent{

    private Number digit;
    private Number digit2;
    public int idlePrice;
    private int x;
    private int third = 0;

    public Driver(){
        super();
        this.setBounds(20, 20, 1000, 1000);
        x = 0;

        digit = new Number(100, 100, x);
        digit2 = new Number(40, 100, x);

        this.add(digit);
        this.add(digit2);

        this.setVisible(true);
    }

    public void numChange(){
        x++;
        digit.setValue(x%10);
        digit2.setValue(x/10);
        if(x==99) {
            x = -1;
        }
    }


    public void buyIdle(){
        timerStuff.idleNum = timerStuff.idleNum+1;
        System.out.println("Congrats! You bought more Idle!");
        cJFrame.count = cJFrame.count - cJFrame.idleCost;
        cJFrame.idleCost = cJFrame.idleCost*2;
        System.out.println("You now have " + cJFrame.count + " points and you need " + cJFrame.idleCost + ".");
    }

    public void multiplier(){
        cJFrame.click = cJFrame.click+10;
        System.out.println("Congrats! You bought a  Tier One upgrade!");
        cJFrame.count = cJFrame.count - cJFrame.tierOne;
        cJFrame.tierOne = cJFrame.tierOne*2;
        System.out.println("You now have " + cJFrame.count + " points and you need " + cJFrame.tierOne + ".");
    }

    public void secUpg(){
        cJFrame.click = cJFrame.click+20;
        System.out.println("Congrats! You bought a Tier Two upgrade!");
        cJFrame.count = cJFrame.count - cJFrame.tierTwo;
        cJFrame.tierTwo = cJFrame.tierTwo*3;
        System.out.println("You now have " + cJFrame.count + " points and you need " + cJFrame.tierTwo + ".");
    }

    public void thirdUpg(){
        third++;
        if(third==20){
            System.out.println("You feel a presence around you......");
            System.out.println("");
        }
        cJFrame.click = cJFrame.click+30;
        System.out.println("Congrats! You bought a Tier Three upgrade!");
        cJFrame.count = cJFrame.count - cJFrame.tierThree;
        cJFrame.tierThree = cJFrame.tierThree*4;
        System.out.println("You now have " + cJFrame.count + " points and you need " + cJFrame.tierThree + ".");
    }

    public void setZero(){
        x=0;
        digit.setValue(0);
        digit2.setValue(0);
    }
}
