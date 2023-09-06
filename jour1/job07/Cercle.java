import java.lang.Math;

public class Cercle {

    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public void aire() {
        System.out.println("Aire du cercle de rayon "+rayon+": " +(Math.PI * (Math.pow(rayon, 2)))+".");
    }

}