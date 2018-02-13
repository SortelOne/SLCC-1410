import java.util.Random;

public class Number extends daNumber{

    protected int value;

    public Number (int x, int y, int v){
        super(x, y, v);

        if(v == 0){
            zero();
        }
        else if(v == 1){
            one();
        }
        else if(v == 2){
            two();
        }
        else if(v == 3){
            three();
        }
        else if(v == 4){
            four();
        }
        else if(v == 5){
            five();
        }
        else if(v == 6){
            six();
        }
        else if(v == 7){
            seven();
        }
        else if(v == 8){
            this.all();
        }
        else if(v == 9){
            nine();
        }
    }

    protected void zero() {
        topLeft.setVisible(true);
        midMid.setVisible(false);
        botMid.setVisible(true);
        topMid.setVisible(true);
        botLeft.setVisible(true);
        topRight.setVisible(true);
        botRight.setVisible(true);
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
        topLeft.setVisible(true);
        midMid.setVisible(true);
        botMid.setVisible(true);
        topMid.setVisible(false);
        botLeft.setVisible(true);
        topRight.setVisible(false);
        botRight.setVisible(true);
        repaint();
    }

    protected void seven() {
        topLeft.setVisible(false);
        midMid.setVisible(false);
        botMid.setVisible(false);
        topMid.setVisible(true);
        botLeft.setVisible(false);
        topRight.setVisible(true);
        botRight.setVisible(true);
        repaint();
    }

    protected void nine() {
        topLeft.setVisible(true);
        midMid.setVisible(true);
        botMid.setVisible(false);
        topMid.setVisible(true);
        botLeft.setVisible(false);
        topRight.setVisible(true);
        botRight.setVisible(true);
        repaint();
    }

    public int getValue(){
        return value;
    }

    public void setValue(int v){
        if(v==0){
            this.zero();
        }
        if(v==1){
            this.one();
        }
        if(v==2){
            this.two();
        }
        if(v==3){
            this.three();
        }
        if(v==4){
            this.four();
        }
        if(v==5){
            this.five();
        }
        if(v==6){
            this.six();
        }
        if(v==7){
            this.seven();
        }
        if(v==8){
            this.all();
        }
        if(v==9){
            this.nine();
        }
    }


}
    //make methods for different numbers (displayNum or something);
