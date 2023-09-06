import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez saisir votre nom: ");
		String input = sc.next();
		sc.close();

		System.out.println("Hello, "+input+"!");

	}

}