import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExercice {
	
	private static int num = 0;
	private static int factor = 0;

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Aucun arguments.");
			System.exit(1);
		}
		
		if (args.length > 1) {
			System.out.println("Trop d'arguments.");
			System.exit(1);
		}
		
		try {
			factor = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.out.println("Argument invalide.");
			System.exit(1);
		}
		
		ExecutorService executor = Executors.newFixedThreadPool(factor);
		
		int i = 0;
		while(i < factor) {
			executor.execute(getTaskAdd(i+1));
			i++;
		}

		executor.shutdown();
		while(!executor.isTerminated()) {}
		
		System.out.println("\nRésultat: "+num);
	}
	
	private synchronized static Runnable getTaskAdd(int i) {
		return () -> {
			num += factor;
			System.out.println("Résultat de la tâche "+i+": "+num);
		};
	}

}
