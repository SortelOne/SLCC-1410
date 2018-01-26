import javax.swing.*;

public class Main{

    public static void main(String[] args){
        Number one = new Number(20, 20, 1);
        Number two = new Number(100, 20, 2);
        Number three = new Number(180, 20, 3);
        Number four = new Number(260, 20, 4);
        Number five = new Number(340, 20, 5);
        Number six = new Number(420, 20, 6);
        Number seven = new Number(500, 20, 7);
        Number eight = new Number(580, 20, 8);
        Number nine = new Number(660, 20, 9);
        Number zero = new Number(740, 20, 0);
        JFrame frame = new JFrame("RYAN");
        frame.setBounds(10, 10, 1000, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(zero);
        frame.setVisible(true);
    }
}
