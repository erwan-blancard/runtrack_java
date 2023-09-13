import java.util.*;
import java.util.stream.Collectors;

public class StreamCollectExercice {

	private static int maxCheck = 0;

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
		List<Integer> nombresFiltres;

		try {
			maxCheck = Integer.parseInt(args[0]);
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
				.filter(i -> i < maxCheck)
				.mapToInt(i -> i)
				.boxed()
				.collect(Collectors.toList());
		
		if (nombresFiltres.size() == 0) {
			System.out.println("Aucun nombre inférieur à "+maxCheck+".");
			System.exit(0);
		}
		
		System.out.print("Nombres inférieurs à "+maxCheck+": ");
		for (int i = 0; i < nombresFiltres.size(); i++) {
			System.out.print(nombresFiltres.get(i) + ((i != nombresFiltres.size()-1) ? ", " : "\n"));
		}
	}
	
}