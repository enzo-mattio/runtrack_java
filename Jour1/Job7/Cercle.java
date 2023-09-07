package Job7;

public class Cercle {
    private final double rayon;
    public Cercle(double rayon) {
        this.rayon = rayon;
    }
    public double calculerAire() {
        return Math.PI * Math.pow(rayon, 2);
    }
}
