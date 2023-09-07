package Job3;

import java.util.Scanner;

public class Calculatrice {
    static Scanner Number1 = new Scanner(System.in);
    static Scanner Number2 = new Scanner(System.in);
    static int number1;
    static int number2;

    public static void main(String[] args) {
        System.out.println("Enter the first number:");
        number1 = Number1.nextInt();
        System.out.println("Enter the second number:");
        number2 = Number2.nextInt();
        addition();
        soustraction();
        multiplication();
        division();
    }
    private static void addition() {
        float add = number1 + number2;
        System.out.println("Somme: " + add);
    }
    private static void soustraction() {
        float soustraction_temp = number1 - number2;
        System.out.println("Différence: " + soustraction_temp);
    }
    private static void multiplication() {
        float multi = number1 * number2;
        System.out.println("Produit: " + multi);
    }
    private static void division() {
        float div = (float) number1 / number2;
        System.out.println("Division: " + div);
    }


}
