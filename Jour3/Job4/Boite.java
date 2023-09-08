package Jour3.Job4;

public class Boite<T> {
    private T contenu;

    public void ajouterElement(T element) {
        this.contenu = element;
    }

    public T recupererElement() {
        return contenu;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Utilisation : java Boite <type> <valeur>");
            System.exit(1);
        }

        String type = args[0];
        String valeur = args[1];

        if (type.equals("Integer") || type.equals("int")) {
            try {
                Integer valeurEntier = Integer.parseInt(valeur);
                Boite<Integer> boite = new Boite<>();
                boite.ajouterElement(valeurEntier);
                Integer elementRecupere = boite.recupererElement();
                System.out.println("Entier récupéré : " + elementRecupere);
            } catch (NumberFormatException e) {
                System.out.println("La valeur n'est pas un entier valide.");
            }
        } else if (type.equals("String") || type.equals("string")) {
            Boite<String> boite = new Boite<>();
            boite.ajouterElement(valeur);
            String elementRecupere = boite.recupererElement();
            System.out.println("String récupéré : " + elementRecupere);
        } else {
            System.out.println("Type non pris en charge : " + type);
        }
    }
}
