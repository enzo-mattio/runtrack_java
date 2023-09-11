package Jour4.Job3;

public class Bank {
    public int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount, String who) {
        System.out.println(who + " is withdrawing " + amount + " from the bank");
        balance = balance - amount;
    }
}
