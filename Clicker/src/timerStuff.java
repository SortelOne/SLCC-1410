import java.util.TimerTask;

public class timerStuff extends TimerTask {

    public static int idleNum;

    public void run() {
        cJFrame.count = cJFrame.count+idleNum;
        System.out.println(idleNum);
    }
}
