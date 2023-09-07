public class Voiture {
	private int vitesse = 0;

	private boolean en_marche = false;

	public Voiture(int vitesse) throws VitesseLimiteDepasseeException {
		this.vitesse = vitesse;
		if (vitesse > 100) { throw new VitesseLimiteDepasseeException(); }
	}

	public void demarrer() {
		if (!en_marche) {
			en_marche = true;
			System.out.println("La voiture démarre.");
		} else {
			System.out.println("La voiture est déja démarrée.");
		}
	}

	public void accelererDe10() throws VitesseLimiteDepasseeException {
		if (en_marche) {
			vitesse += 10;
			if (vitesse > 100) { throw new VitesseLimiteDepasseeException(); }
			System.out.println("La vitesse est maintenant de "+vitesse+" km/h.");
		} else {
			System.out.println("Impossible d'accélérer: démarrez d'abord la voiture.");
		}
	}

	public void freiner() {
		vitesse = 0;
		System.out.println("La voiture s'arrête. Vitesse réinitialisée à 0 km/h.");
	}

	public void vitesse() {
		System.out.println("Vitesse: "+vitesse+"km/h.");
	}

}