public class ThreadInterruptionExercice {
	
	private static long sleepTime = 0;

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Aucun argument.");
			System.exit(1);
		}
		
		if (args.length > 1) {
			System.out.println("Trop d'arguments.");
			System.exit(1);
		}
		
		try {
			sleepTime = Integer.parseInt(args[0]) * 1000;
		} catch (NumberFormatException e) {
			System.out.println("Argument invalide.");
			System.exit(1);
		}
		
		Thread thread = new Thread(() -> {
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {}
		});
		thread.start();
		
		long startTime = System.currentTimeMillis();
		
		while (true) {
			if (System.currentTimeMillis() > startTime + (sleepTime/2)) {
				thread.interrupt();
				System.out.println("Thread interrompu après "+sleepTime/2000+" secondes.");
				break;
			}
		}
	}

}
