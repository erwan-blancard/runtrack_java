import java.util.ArrayList;
import java.util.Collections;

public class Etudiant {

    private String nom;
    private ArrayList<Integer> notes;

    public Etudiant(String nom) {
        this.nom = nom;
        this.notes = new ArrayList<Integer>();
    }

    public void nom() {
        System.out.println("Nom de l'étudiant: "+nom+".");
    }

    public void notes() {
        System.out.print("Notes: [");
        for (int i = 0; i < notes.size(); i++) {
            System.out.print(notes.get(i) + ((i != notes.size()-1) ? ", " : "]\n"));
        }
    }

    public void ajouterNote(int note) {
        notes.add(note);
        System.out.println("Note ajoutée: "+note);
    }

    public void meilleurNote() {
        if (notes.size() > 0) {
            System.out.println("Meilleur note: "+Collections.max(notes));
        } else {
            System.out.println("L'étudiant n'a pas de notes.");
        }
    }

    public void pireNote() {
        if (notes.size() > 0) {
            System.out.println("Pire note: "+Collections.min(notes));
        } else {
            System.out.println("L'étudiant n'a pas de notes.");
        }
    }

    public void moyenne() {
        if (notes.size() > 0) {
            int somme = 0;
            for (Integer note: notes) {
                somme += note;
            }
            System.out.println("Moyenne: "+(somme/notes.size()));
        } else {
            System.out.println("L'étudiant n'a pas de notes.");
        }
    }

}