import java.util.Random;

public class JeuDeDes {

    public static void main(String[] args) {
        Random r = new Random();

        int de1 = r.nextInt(1, 7);
        int de2 = r.nextInt(1, 7);

        System.out.println("Dé 1: "+de1);
        System.out.println("Dé 2: "+de2);

        System.out.println("Somme: "+(de1+de2));
    }

}