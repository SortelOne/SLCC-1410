import javax.swing.*;

public class Driver extends JComponent{

    private Number digit;
    private Number digit2;
    private int x;

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

    public void setColor(){
        ranColors.changeColors();
    }

    public void setZero(){
        x=0;
        digit.setValue(0);
        digit2.setValue(0);
    }
}
