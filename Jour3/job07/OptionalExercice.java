import java.util.Optional;

public class OptionalExercice {

	public static void main(String[] args) {
		Optional<String[]> opChaine = Optional.ofNullable(args);
		if (opChaine.isPresent()) {
			System.out.println("Longueur de la chaîne: "+String.join(" ", args).length());
		} else {
			System.out.println("Chaîne non fournie");
		}
	}

}