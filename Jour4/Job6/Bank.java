package Jour4.Job6;

public class Bank {
    public int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int amount, String who) {
        System.out.println(who + " is withdrawing " + amount + " from the bank");
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient funds for " + who);
        }
    }

}