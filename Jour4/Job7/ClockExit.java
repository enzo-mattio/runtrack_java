package Jour4.Job7;


public class ClockExit {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ThreadInterruptionExercise <seconds>");
            System.exit(1);
        }

        int sleepTimeSeconds = Integer.parseInt(args[0]);

        Thread sleepThread = new Thread(() -> {
            try {
                System.out.println("Thread started and will sleep for " + sleepTimeSeconds + " seconds.");
                Thread.sleep(sleepTimeSeconds * 1000); // Convert seconds to milliseconds
                System.out.println("Thread woke up after " + sleepTimeSeconds + " seconds.");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted after " + (sleepTimeSeconds / 2) + " seconds.");
            }
        });

        sleepThread.start();

        // Interrupt the thread after half of the specified time
        try {
            Thread.sleep((sleepTimeSeconds / 2) * 1000); // Convert seconds to milliseconds
            sleepThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

