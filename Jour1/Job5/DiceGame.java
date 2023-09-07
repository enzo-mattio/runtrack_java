package Job5;

public class DiceGame {
    public static void main(String[] args) {
        int dice1 = 0;
        int dice2 = 0;
        dice1 = (int) (Math.random() * 6) + 1;
        dice2 = (int) (Math.random() * 6) + 1;
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        System.out.println("Sum: " + (dice1 + dice2));
    }
}
