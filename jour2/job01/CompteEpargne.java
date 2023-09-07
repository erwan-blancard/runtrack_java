public class CompteEpargne extends CompteBancaire {

	protected double tauxInteret;
	
	public CompteEpargne(double solde, double tauxInteret) {
		super(solde);
		this.tauxInteret = tauxInteret;
	}

	@Override
	public void solde() {
        System.out.println("Solde actuel: "+solde+"€ avec un taux d'intérêt de "+tauxInteret+"%.");
    }

	public void ajouterInterets() {
		double interets = ((solde*tauxInteret) / 100);
		solde += interets;
		System.out.println("Intérêts ajoutés: "+interets+"€. Nouveau solde: "+solde+"€.");
	}

}