public class VoitureExercice {

    public static void main(String[] args) {
        Voiture voiture = null;
        if (args != null && args.length == 1) {
            try {
                voiture = new Voiture(Integer.parseInt(args[0]));
            } catch (NumberFormatException e) {
                System.out.println("Arguments invalides.");
                System.exit(1);
            } catch (VitesseLimiteDepasseeException e) {
                System.out.println(e.getMessage());
                System.exit(1);
            }
        } else {
            System.out.println("Arguments invalides.");
            System.exit(1);
        }

        voiture.vitesse();
    }

}
