public class Reptile extends ClickableImage {

    public Reptile(String path, PictureFrame win){
        super(path, win);
    }

    public Reptile(String path, String n, PictureFrame win){
        super(200, 700, 100, 100, path, n, win);
    }

    public void changeImage(){

    }
}
