public class Mammal extends ClickableImage{


    public Mammal(String path, PictureFrame win){
        super(path, win);
    }

    public Mammal(String path, String n, PictureFrame win){
        super(500, 450, 200, 200, path, n, win);
    }

    public void changeImage(){
        count++;
        count%=4;
        switch(count){
            case 1: setImage("moose.png");
            break;
            case 2: setImage("Bear.png");
            break;
            case 3: setImage("Wolf.png");
            count = 0;
            break;
        }
    }
}
