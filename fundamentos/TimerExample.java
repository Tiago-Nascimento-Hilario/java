import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
    public static void main(String[] args) {
        
        Timer timer = new Timer();
        
        TimerTask tarefa = new TimerTask() {
            public void run (){
                for(int i = 0; i <= 5; i++){
                    System.out.println(i);
                }
            }
        };
        
        timer.schedule(tarefa, 5000);
    }
}
