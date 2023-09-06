public class Voiture {

	private String marque;
	private String couleur;
	private int vitesse = 0;

	private boolean en_marche = false;

	public Voiture(String marque, String couleur) {
		this.marque = marque;
		this.couleur = couleur;
	}

	public void demarrer() {
		if (!en_marche) {
			en_marche = true;
			System.out.println("La voiture démarre.");
		} else {
			System.out.println("La voiture est déja démarrée.");
		}
	}

	public void accelererDe10() {
		if (en_marche) {
			vitesse += 10;
			System.out.println("La vitesse est maintenant de "+vitesse+" km/h.");
		} else {
			System.out.println("Impossible d'accélérer: démarrez d'abord la voiture.");
		}
	}

	public void freiner() {
		vitesse = 0;
		System.out.println("La voiture s'arrête. Vitesse réinitialisée à 0 km/h.");
	}

}