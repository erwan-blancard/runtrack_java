public class GenericsExercice {

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Aucun arguments.");
			System.exit(1);
		}

		if (args.length > 1) {
			System.out.println("Trop d'arguments");
			System.exit(1);
		}

		Boite<String> boite = new Boite<String>();

		boite.ajouterElement(args[0]);
		System.out.println("Contenu de la boîte: "+boite.recupererContenu());
	}

}