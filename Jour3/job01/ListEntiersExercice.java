public class ListEntiersExercice {

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Aucun arguments.");
			System.exit(1);
		}

		int[] entiers = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			try {
				entiers[i] = Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
				System.out.println("Le nombre "+args[i]+" n'est pas un entier.");
				System.exit(1);
			}
		}

		int somme = 0;
		for (int nombre : entiers) {
			somme += (nombre % 2 == 0) ? nombre : 0;
		}

		System.out.println("Somme des nombres paires: "+somme);
	}
	
}