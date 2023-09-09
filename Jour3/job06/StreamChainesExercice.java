import java.util.Arrays;
import java.util.List;

public class StreamChainesExercice {

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Aucun arguments.");
			System.exit(1);
		}
		
		List<String> chaines = Arrays.asList(args);
		int[] positionsChainesFiltres;

		positionsChainesFiltres = chaines.stream()
				.filter(s -> s.length() == 3 && s.charAt(0) == 'a')
				.mapToInt(s -> chaines.indexOf(s))
				.toArray();
		
		if (positionsChainesFiltres.length == 0) {
			System.out.println("Pas de mots filtrés");
			System.exit(0);
		}
		
		System.out.print("Mots filtrés: ");
		for (int i = 0; i < positionsChainesFiltres.length; i++) {
			System.out.print(chaines.get(positionsChainesFiltres[i]) + ((i != positionsChainesFiltres.length-1) ? ", " : "\n"));
		}
	}

}