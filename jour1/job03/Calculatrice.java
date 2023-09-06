import java.util.Scanner;

public class Calculatrice {
	
	public static void main(String[] args) {

		double num1 = 0;
		double num2 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Entrez le premier nombre: ");
		try {
			num1 = Double.parseDouble(sc.next());
		} catch(NumberFormatException e) {
			System.out.println("Entrée invalide: "+e.getMessage());
		}

		System.out.print("Entrez le deuxième nombre: ");
		try {
			num2 = Double.parseDouble(sc.next());
		} catch(NumberFormatException e) {
			System.out.println("Entrée invalide: "+e.getMessage());
		}

		sc.close();

		System.out.println("Somme: "+(num1+num2));
		System.out.println("Différence: "+(num1-num2));
		System.out.println("Produit: "+(num1*num2));
		if (num2 == 0) { System.out.println("Division: N/A"); }
		else { System.out.println("Division: "+(num1/num2)); }

	}

}