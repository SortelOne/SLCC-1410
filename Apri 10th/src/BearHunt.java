import java.util.Random;

public class BearHunt {

    String[][] adventure;

    public BearHunt(){
        adventure = new String[3][3];

        System.out.println("WERE GOING ON A GARE-BEAR HUNT. WHAT A BEAUTIFUL DAY.");

        adventure[0][0] = "OH CRAP. THERE IS A FENCE IN THE WAY. WE CANT GO UNDER IT WE CANT GO OVER IT WE MUST QUANTUM TUNNEL THROUGH IT. WOOSH WOOSH WOOSH";
        adventure[0][1] = "AH SHUCKS. WE FOUND A KELSON. WE CANT GO OVER IT WE CANT GO UNDER IT WE HAVE TO GO THROUGH IT. STAB STAB STAB.";
        adventure[0][2] = "OH NO. THE ATLANTIC OCEAN. WE CANT GO OVER IT WE CANT GO UNDER IT WE HAVE TO GO THROUGH IT. DIVE DIVE DIVE!";
        adventure[1][0] = "OH NO. A PORTAL TO AN ALTERNATE UNIVERSE. WE CANT GO OVER IT WE CANT GO UNDER IT WE HAVE TO GO THROUGH IT. WUBBBBBBBBBBBBBBBB.";
        adventure[2][0] = "AH MAN. THE GRAND CANYON. WE CAN GO OVER THIS ONE. GET TO THE CHOPPAH! CHA CHA CHA CHA CHA";
        adventure[1][1] = "OH NO. A NUCLEAR WASTE DEPOSIT. WE CANT GO OVER IT WE CANT GO UNDER IT WE HAVE TO GO THROUGH IT. COUGH COUGH COUGH.";
        adventure[1][2] = "BUNKRUM. WE FOUND ANOTHER KELSON. WE CANT GO OVER IT WE CANT GO UNDER IT WE HAVE TO GO THROUGH IT. STAB STAB STAB.";
        adventure[2][1] = "OUR LIVES ARE OVER. TALL GRASS. WE CANT GO OVER IT WE CANT GO UNDER IT WE HAVE TO GO THROUGH IT. SWOOSH SWOOSH SWOOSH.";
        adventure[2][2] = "OOPS-A-DASIE. WE FOUND A MOUNTAIN. WE CANT GO OVER IT WE CANT GO UNDER IT WE HAVE TO GO THROUGH IT. DIGGY DIGGY HOLE DIGGY HOLE HOLE DIGGY.";

        move(0, 0);
    }

    public void move(int r, int c){

        System.out.println(adventure[r] [c]);
        if((r>2)&&(c>2)){
            return;
        }
        else if(r>2){
            move(r, c+1);
        }
        else if(c>2){
            move(r+1, c);
        }
        else if((r<2)&&(c<2)){
            Random gen = new Random();
            int addd = gen.nextInt(2);
            if(addd==1){
                move(r+1, c);
            }
            else{
                move(r, c+1);
            }
        }
        System.out.println("WE MUST GO BACKWARDS TO NOT DIE OR SOMETHING.");
        System.out.println(adventure[r] [c]);
    }

    public static void main(String[]args){
       BearHunt bear = new BearHunt();
    }
}
