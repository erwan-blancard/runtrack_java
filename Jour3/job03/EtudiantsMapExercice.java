import java.util.HashMap;

public class EtudiantsMapExercice {

	public static void main(String[] args) {
		HashMap<Integer, String> etudiants = new HashMap<Integer, String>();

		etudiants.put(102, "Marie");
		etudiants.put(103, "Jean");
		etudiants.put(101, "Pierre");

		for (int matricule : etudiants.keySet()) {
			System.out.println(matricule+": "+etudiants.get(matricule));
		}
	}

}