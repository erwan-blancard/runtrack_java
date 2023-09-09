import java.util.ArrayList;
import java.util.Arrays;

public class MotsUniquesExercice {

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Aucun arguments.");
			System.exit(1);
		}

		ArrayList<String> mots = new ArrayList<String>(Arrays.asList(args));
		ArrayList<String> motsUniques = new ArrayList<String>();

		for (String mot : mots) {
			if (mots.indexOf(mot) == mots.lastIndexOf(mot)) {
				motsUniques.add(mot);
			}
		}

		if (motsUniques.size() == 0) {
			System.out.println("Aucun mot unique.");
			System.exit(0);
		}

		System.out.print("Mots uniques: ");
		for (int i = 0; i < motsUniques.size(); i++) {
			System.out.print(motsUniques.get(i) + ((i != motsUniques.size()-1) ? ", " : "\n"));
		}
	}
	
}