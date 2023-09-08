package Jour3.Job2;

public class Mots_Uniques {
    public static void main(String[] args) {
        if (args.length >= 1) {
            // Récupérer les arguments
            String[] arguments = new String[args.length];
            System.arraycopy(args, 0, arguments, 0, args.length);
            // Comparer les arguments
            StringBuilder mots = new StringBuilder();
            for (int i = 0; i < arguments.length; i++) {
                boolean unique = true;
                for (int j = 0; j < arguments.length; j++) {
                    if (i != j && arguments[i].equals(arguments[j])) {
                        unique = false;
                        break;
                    }
                }
                if (unique) {
                    mots.append(" ").append(arguments[i]);
                }
            }
            // Afficher le résultat
            if (mots.isEmpty()) {
                System.out.println("Il n'y a pas de mots unique");
            }
            else {
                System.out.println("Mots uniques:" + mots);
            }

        }
        else {
            System.out.println("Il faut au moins 1 argument");
        }
    }
}
