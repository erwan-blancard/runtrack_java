/*
Créez une classe CompteBancaire avec un solde, et des méthodes pour déposer, retirer,
et afficher le solde. Assurez-vous que le solde ne peut pas devenir négatif.
 */
public class CompteBancaire {

    private double solde = 0;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public void solde() {
        System.out.println("Solde actuel: "+solde+"€.");
    }

    public void depot(double valeur) {
        solde += valeur;
        System.out.println(valeur+"€ déposés. Nouveau solde: "+solde+"€.");
    }

    public void retrait(double valeur) {
        if (solde - valeur >= 0) {
            solde -= valeur;
            System.out.println(valeur+"€ retirés. Nouveau solde: "+solde+"€.");
        } else {
            System.out.println("Retrait de "+valeur+"€ impossible: le compte n'a pas assez de fonds.");
        }
    }

}