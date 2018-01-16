public class Main {


    public static void buildRectangle(int h, int w) {
        for (int i = 0; i < h; i++) {
            for (int s = 0; s < w; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void buildTriangle(int h){
        for(int i = 0; i < h+1; i++){
            for (int s = 0; s < i; s++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow(int w, int h){
        for(int i = 0; i < h; i++){
            for(int s = 0; s < w; s++){
                if(i==0||i==h-1)
                    System.out.print("* ");
                else{
                    if(s==0||s==w-1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        buildRectangle(3, 9);
        System.out.println();
        buildTriangle(6);
        System.out.println();
        hollow(5, 10);
    }
}
