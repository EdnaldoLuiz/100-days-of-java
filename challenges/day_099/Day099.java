package challenges.day_099;

import java.util.Timer;
import java.util.TimerTask;

public class Day099 {

    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Tarefa executada!");
            }
        };
        timer.schedule(task, 0, 5000);
    }
}
