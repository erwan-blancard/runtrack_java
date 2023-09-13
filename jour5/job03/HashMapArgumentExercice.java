import java.util.*;

public class HashMapArgumentExercice {

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Aucun arguments.");
			System.exit(1);
		}

		if (args.length % 2 != 0) {
			System.out.println("Le nombre d'arguments n'est pas pair.");
			System.exit(1);
		}

		HashMap<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < args.length; i += 2) {
			map.put(args[i], args[i+1]);
		}

		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}

	}
	
}