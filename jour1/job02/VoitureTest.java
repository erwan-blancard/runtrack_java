public class VoitureTest {
	
	public static void main(String[] args) {

		Voiture voiture = new Voiture("Renault", "Grise");

		voiture.demarrer();

		voiture.accelererDe10();
		voiture.accelererDe10();

		voiture.freiner();

	}

}