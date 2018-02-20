public class Bird extends ClickableImage{

    public Bird(String path, PictureFrame win){
        super(path, win);
    }

    public Bird(String path, String n, PictureFrame win){
        super(10, 10, 100, 100, path, n, win);
    }

    public void changeImage(){

    }
}
