package Jour4.Job4;

import java.util.concurrent.*;

public class CallableFutureExercise implements Callable<Integer> {
    int num1;
    int num2;
    private CallableFutureExercise(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    @Override
    public Integer call() throws Exception {
        return num1 * num2;
    }
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Expected: java CallableFutureExercise <num1> <num2>");
            System.exit(1);
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        CallableFutureExercise task = new CallableFutureExercise(num1, num2);

        ExecutorService executor = Executors.newFixedThreadPool(1);

        Future<Integer> future = executor.submit(task);

        try {
            Integer result = future.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        // Shutdown the executor
        executor.shutdown();
    }

}
