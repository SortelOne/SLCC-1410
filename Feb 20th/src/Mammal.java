public class Mammal extends ClickableImage{

    public Mammal(String path, PictureFrame win){
        super(path, win);
    }

    public Mammal(String path, String n, PictureFrame win){
        super(500, 500, 100, 100, path, n, win);
    }

    public void changeImage(){

    }
}
