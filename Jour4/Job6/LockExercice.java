package Jour4.Job6;

import Jour4.Job3.Bank;

import java.util.concurrent.CountDownLatch;

public class LockExercice {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Expected: java SynchronizationExercise <Balance> <Withdraw>");
            System.exit(1);
        }
        int withdraw = Integer.parseInt(args[1]);
        Bank mybank = new Bank(Integer.parseInt(args[0]));
        CountDownLatch latch = new CountDownLatch(1);
        CountDownLatch latch2 = new CountDownLatch(1);

        Thread withdraw1 = new Thread(() -> {
            mybank.withdraw(withdraw, "Thread 1");
            latch.countDown();
        });
        Thread withdraw2 = new Thread(() -> {
            mybank.withdraw(withdraw, "Thread 2");
            latch2.countDown();
        });

        // Start the threads
        withdraw1.start();
        withdraw2.start();

        // Wait for both threads to finish
        try {
            latch.await();
            latch2.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Synchronize to safely print the balance
        synchronized (mybank) {
            System.out.println("Balance: " + mybank.getBalance());
        }
    }
}