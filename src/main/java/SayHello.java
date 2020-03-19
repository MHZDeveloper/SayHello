import java.util.Timer;
import java.util.TimerTask;

public class SayHello extends TimerTask {

    public void run() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new SayHello(), 0, 2000);
    }
}
