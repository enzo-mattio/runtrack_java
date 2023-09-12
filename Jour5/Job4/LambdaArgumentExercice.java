package Jour5.Job4;

import java.util.function.Predicate;

public class LambdaArgumentExercice {
    public static void main (String[] args) {
        if(args.length != 2) {
            System.out.println("Usage: java LambdaArgumentExercice <string> <longueur>");
            System.exit(1);
        }
        int longueur = Integer.parseInt(args[1]);
        Predicate<String> predicate = s -> s.length() > longueur;
        if (predicate.test(args[0]))
            System.out.println("La chaîne est plus longue que " + longueur + " caractères");
        else
            System.out.println("La chaîne est plus courte que " + longueur + " caractères");
    }
}
