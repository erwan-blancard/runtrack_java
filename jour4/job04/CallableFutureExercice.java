import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableFutureExercice {
	
	private static double num1 = 0;
	private static double num2 = 0;

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Aucun arguments.");
			System.exit(1);
		}
		
		if (args.length < 2) {
			System.out.println("Il manque un argument.");
			System.exit(1);
		} else if (args.length > 2) {
			System.out.println("Trop d'arguments.");
			System.exit(1);
		}
		
		try {
			num1 = Double.parseDouble(args[0]);
			num2 = Double.parseDouble(args[1]);
		} catch (NumberFormatException e) {
			System.out.println("Argument(s) invalide(s).");
			System.exit(1);
		}
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<Double> multiplyTask = executor.submit(new Callable<Double>() {

			@Override
			public Double call() throws Exception {
				return num1 * num2;
			}
			
		});
		
		while (!multiplyTask.isDone()) { try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} }
		
		try {
			Double result = multiplyTask.get();
			executor.shutdown();
			System.out.println("Résultat de la multiplication: " + result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
