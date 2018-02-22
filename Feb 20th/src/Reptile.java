public class Reptile extends ClickableImage {

    public Reptile(String path, PictureFrame win) {
        super(path, win);
    }

    public Reptile(String path, String n, PictureFrame win) {
        super(200, 700, 100, 100, path, n, win);
    }

    public void changeImage() {
        count++;
        count %= 4;
        switch (count) {
            case 1:
                setImage("alligator.png");
                break;
            case 2:
                setImage("turtle.png");
                break;
            case 3:
                setImage("frog.png");
                count = 0;
                break;
        }
    }
}
