import javax.swing.*;

public class Main{

    public static void main(String[] args){
        daNumber ryan = new daNumber(20, 20);
        JFrame frame = new JFrame("RYAN");
        frame.setBounds(0, 0, 500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(ryan);
    }
}
