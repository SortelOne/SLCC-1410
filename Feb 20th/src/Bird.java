public class Bird extends ClickableImage{

    public Bird(String path, PictureFrame win){
        super(path, win);
    }

    public Bird(String path, String n, PictureFrame win){
        super(10, 10, 100, 100, path, n, win);
    }

    public void changeImage(){
        count++;
        count%=4;
        switch(count) {
            case 1:
                setImage("owl.png");
                break;
            case 2:
                setImage("goose.png");
                break;
            case 3:
                setImage("heron.png");
                count = 0;
                break;
        }
    }
}
