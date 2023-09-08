package Jour3.Job1;

public class Somme_pair {
    // Vérifier les arguments
    public static void main(String[] args) {
        if (args.length >= 2) {
            // Récupérer les arguments
            int[] arguments = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                arguments[i] = Integer.parseInt(args[i]);
            }
            // Calculer la somme des entiers pairs
            int somme = 0;
            for (int argument : arguments) {
                if (argument % 2 == 0) {
                    somme += argument;
                }
            }
            // Afficher le résultat
            if (somme == 0) {
                System.out.println("Il n'y a pas d'entiers pairs");
            }
            else {
                System.out.println("La somme des entiers pairs est " + somme);
            }
        }
        else {
            System.out.println("Il faut au moins 2 arguments");
        }

    }
}

