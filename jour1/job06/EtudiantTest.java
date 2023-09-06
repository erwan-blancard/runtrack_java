public class EtudiantTest {

    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant("Erwan");

        etudiant.nom();
        etudiant.ajouterNote(20);
        etudiant.ajouterNote(15);
        etudiant.ajouterNote(17);
        etudiant.ajouterNote(13);
        etudiant.ajouterNote(14);
        etudiant.notes();
        etudiant.meilleurNote();
        etudiant.pireNote();
        etudiant.moyenne();
    }

}