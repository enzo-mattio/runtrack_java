package Job4;
import java.util.Scanner;

public class CompteBancaire {
    static Scanner sc = new Scanner(System.in);
    static int soldes;
    static String  separator = "====================================";
    public static void main(String[] args) {
        System.out.println("Quel est votre solde?");
        soldes = sc.nextInt();
        while (true) {
            System.out.println(separator);
            System.out.println("Que voulez-vous faire?");
            System.out.println("1. Dépot");
            System.out.println("2. Retrait");
            System.out.println("3. Afficher");
            System.out.println("4. Quitter");
            System.out.println("Votre choix:");
            int choice = sc.nextInt();
            System.out.println(separator);
            switch (choice) {
                case 1:
                    depot();
                    System.out.println(separator);

                    break;
                case 2:
                    retrait();
                    System.out.println(separator);

                    break;
                case 3:
                    afficher();
                    System.out.println(separator);

                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Erreur!");
                    break;
            }
        }


    }
    private static void depot() {
        int depot;
        System.out.println("Combien voulez-vous déposer?");
        depot = sc.nextInt();
        soldes += depot;
    }
    private static void retrait() {
        int retrait;
        System.out.println("Combien voulez-vous retirer?");
        retrait = sc.nextInt();
        soldes -= retrait;
    }
    private static void afficher() {
        System.out.println("Votre solde est de: " + soldes);
    }
}
