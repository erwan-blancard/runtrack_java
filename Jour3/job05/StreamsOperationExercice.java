import java.util.ArrayList;

public class StreamsOperationExercice {

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Aucun arguments.");
			System.exit(1);
		}

		ArrayList<Integer> nombres = new ArrayList<Integer>(args.length);
		int[] nombresFiltres;

		for (int i = 0; i < args.length; i++) {
			try {
				nombres.add(Integer.parseInt(args[i]));
			} catch (NumberFormatException e) {
				System.out.println("Le nombre "+args[i]+" n'est pas un entier.");
				System.exit(1);
			}
		}

		nombresFiltres = nombres.stream()
				.mapToInt(i -> i * 2)		// ajoute les entiers passés dans le stream en les multipliant par 2
				.filter(i -> i <= 10)		// filtre les nombres supérieurs à 10
				.toArray();
		
		if (nombresFiltres.length == 0) {
			System.out.println("Resultat: []");
			System.exit(0);
		}
		
		System.out.print("Resultat: [");
		for (int i = 0; i < nombresFiltres.length; i++) {
			System.out.print(nombresFiltres[i] + ((i != nombresFiltres.length-1) ? ", " : "]\n"));
		}
	}

}