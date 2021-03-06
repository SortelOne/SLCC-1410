public class Landscape extends ClickableImage {

    public Landscape(String path, PictureFrame win) {
        super(path, win);
    }

    public Landscape(String path, String n, PictureFrame win) {
        super(0, 0, 1000, 800, path, n, win);
    }

    public void changeImage() {
        count++;
        count %= 4;
        switch (count) {
            case 1:
                setImage("MountainFall.jpg");
                break;
            case 2:
                setImage("MountainSummer.jpg");
                break;
            case 3:
                setImage("MountainWinter.jpg");
                count = 0;
                break;
        }
    }
}