import java.lang.Math;

public class Carre {

    private double longueur;

    public Carre(double longueur) {
        this.longueur = longueur;
    }

    public void aire() {
        System.out.println("Aire du carré de longueur "+longueur+": " +(longueur * longueur)+".");
    }

}