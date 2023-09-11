package Jour4.Job2;
import java.lang.Thread;

public class RunnableInterfaceExercice {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                Runnable.run_Exo();
                try {
                    Thread.sleep(1000); // Délai d'une seconde (1000 millisecondes)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }

}
