import java.util.HashSet;
import java.util.Iterator;

public class HashSetArgumentExercice {

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Aucun arguments.");
			System.exit(1);
		}

		HashSet<String> list = new HashSet<String>();
		for (int i = 0; i < args.length; i++) {
			list.add(args[i]);
		}

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
