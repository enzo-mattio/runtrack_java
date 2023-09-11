package Jour4.Job5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExercise {
    int num;
    public static void main (String[] args){
        if (args.length != 1) {
            System.out.println("Expected: java ExecutorServiceExercise <num>");
            System.exit(1);
        }
        int num = Integer.parseInt(args[0]);
        ExecutorService executor = Executors.newFixedThreadPool(3);
        // Starts 3 threads and multiply num by her ID

        for (int i = 0; i < 3; i++) {
            int finalI = i;
            executor.execute(() -> System.out.println("Résultat de la tache " + finalI + " : " + num * (finalI + 1)));
        }
        // Shutdown the executor
        executor.shutdown();
    }
}
