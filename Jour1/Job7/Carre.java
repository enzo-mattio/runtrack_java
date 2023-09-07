package Job7;

public class Carre {
    private final double cote;
    public Carre(double cote) {
        this.cote = cote;
    }
    public double calculerAire() {
        return Math.pow(cote, 2);
    }
}
