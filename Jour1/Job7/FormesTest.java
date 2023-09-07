package Job7;

public class FormesTest {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(5);
        Carre carre = new Carre(5);
        System.out.println("Cercle: " + cercle.calculerAire());
        System.out.println("Carre: " + carre.calculerAire());
    }
}
