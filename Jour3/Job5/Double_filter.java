package Jour3.Job5;
//Utilisez-les streams pour transformer une liste de nombres : doublez chaque nombre,
//filtrez ceux supérieurs à 10 et collectez le résultat dans une liste.
public class Double_filter {
    public static void main(String[] args) {
        if (args.length <= 2) {
            System.out.println("Utilisation : java Double_filter <value> <value> <value> ...");
            System.exit(1);
        }
        java.util.List<Integer> list = new java.util.ArrayList<>();
        for (String arg : args) {
            try {
                Integer valeurEntier = Integer.parseInt(arg);
                list.add(valeurEntier);
            } catch (NumberFormatException e) {
                System.out.println("La valeur n'est pas un entier valide.");
            }
        }
        java.util.List<Integer> list2 = list.stream().map(x -> x * 2).filter(x -> x > 10).toList();
        System.out.println("Resultat: " + list2);
    }
}
