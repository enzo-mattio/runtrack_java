package Jour4.Job1;


public class SimpleThreadExercice {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello from thread");
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


