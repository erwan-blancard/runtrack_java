public class BanqueTest {

    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire(100);

        compte.solde();

        compte.depot(50);
        compte.retrait(70);

        compte.retrait(90);
    }

}