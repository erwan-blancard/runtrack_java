public class BanqueExercice {

	public static void main(String[] args) {
		double solde1 = 0;
		double solde2 = 0;
		double interet = 0;

		if (args != null && args.length == 3) {

			try {
				solde1 = Double.parseDouble(args[0]);
				solde2 = Double.parseDouble(args[1]);
				interet = Double.parseDouble(args[2]);
			} catch(NumberFormatException e) {
				System.out.println("Arguments invalides.");
				System.exit(1);
			}

		} else {
			System.out.println("Arguments invalides.");
			System.exit(1);
		}

		CompteBancaire compteBancaire = new CompteBancaire(solde1);
		CompteEpargne compteEpargne = new CompteEpargne(solde2, interet);

		compteBancaire.solde();
		compteEpargne.solde();

		compteEpargne.ajouterInterets();
	}

}