import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter implements ActionListener {

    int vbbl = 0;

    public void addOne(){
        vbbl++;
    }

    public void subOne(){
        vbbl--;
    }

    public void setZero(){
        vbbl=0;
    }

    public int getCount(){
        return vbbl;
    }

    public void actionPerformed(ActionEvent e){
        addOne();
        System.out.println(vbbl);
        cJFrame.numChange();
    }
}
