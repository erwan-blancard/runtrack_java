import java.util.concurrent.Callable;

public class LambdaArgumentExercice {
	
	private static String s = "";
	private static int minLength = 0;

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Aucun arguments.");
			System.exit(1);
		}

		if (args.length < 2) {
			System.out.println("Il manque un argument.");
			System.exit(1);
		} else if (args.length > 2) {
			System.out.println("Trop d'arguments.");
			System.exit(1);
		}

		s = args[0];

		try {
			minLength = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			System.out.println("Taille de chaîne invalide.");
			System.exit(1);
		}

		/*
		if (s.length > minLength) {
			System.out.println("La chaîne " + s + " a une longueur supérieure à "+minLength);
		} else {
			System.out.println("La chaîne " + s + " n'a pas une longueur supérieure à "+minLength);
		}
		*/

		if (compareLength(() -> { return s.length() > minLength; })) {
			System.out.println("La chaîne " + s + " a une longueur supérieure à "+minLength);
		} else {
			System.out.println("La chaîne " + s + " n'a pas une longueur supérieure à "+minLength);
		}

	}

	public static boolean compareLength(Callable<Boolean> c) {
		try {
			return c.call();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
