import java.awt.event.*;

public abstract class ClickableImage extends ImagePanel implements MouseListener{

    protected int count;
    protected String name;
    protected PictureFrame window;

    public ClickableImage(String n, PictureFrame win){
        super();
        count = 0;
        name = n;
        window = win;
        addMouseListener(this);
    }

    public ClickableImage(int x, int y, int w, int h, String path, String n, PictureFrame win){
        super(x, y, w, h, path);
        count = 0;
        name = n;
        window = win;
        addMouseListener(this);
    }

    public String getImageName(){
        return name;
    }

    public abstract void changeImage();

    @Override
    public void mouseClicked(MouseEvent e) {
        window.changeObject(this);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e){}

}
