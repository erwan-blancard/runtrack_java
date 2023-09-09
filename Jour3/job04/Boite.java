public class Boite<T> {

	private T contenu = null;

	public void ajouterElement(T element) {
		contenu = element;
	}

	public T recupererContenu() {
		return contenu;
	}

}