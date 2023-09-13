import java.util.*;

public class ArrayListArgumentExercice {

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Aucun arguments.");
			System.exit(1);
		}

		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < args.length; i++) {
			list.add(args[i]);
		}

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}