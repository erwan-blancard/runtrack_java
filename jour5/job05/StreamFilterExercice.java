import java.util.*;

public class StreamFilterExercice {

	private static int minCheck = 0;

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Aucun arguments.");
			System.exit(1);
		}

		if (args.length < 2) {
			System.out.println("Pas assez d'arguments.");
			System.exit(1);
		}

		ArrayList<Integer> nombres = new ArrayList<Integer>(args.length);
		int[] nombresFiltres;

		try {
			minCheck = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.out.println("Le nombre "+args[0]+" n'est pas un entier.");
			System.exit(1);
		}

		for (int i = 1; i < args.length; i++) {
			try {
				nombres.add(Integer.parseInt(args[i]));
			} catch (NumberFormatException e) {
				System.out.println("Le nombre "+args[i]+" n'est pas un entier.");
				System.exit(1);
			}
		}

		nombresFiltres = nombres.stream()
				.filter(i -> i > minCheck)
				.mapToInt(i -> i)
				.toArray();
		
		if (nombresFiltres.length == 0) {
			System.out.println("Aucun nombre supérieur à "+minCheck+".");
			System.exit(0);
		}
		
		System.out.print("Nombres supérieurs à "+minCheck+": ");
		for (int i = 0; i < nombresFiltres.length; i++) {
			System.out.print(nombresFiltres[i] + ((i != nombresFiltres.length-1) ? ", " : "\n"));
		}
	}
	
}