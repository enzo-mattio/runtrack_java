package Job1;

import java.util.Scanner;

public class Hello {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.printf("Hello, %s\n !", name);
    }
}
