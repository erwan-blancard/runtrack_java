public class RunnableInterfaceExercice implements Runnable {

	@Override
	public void run() {
		int i = 0;
		while (i < 5) {
			System.out.println("En cours d'exécution...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new RunnableInterfaceExercice());
		thread.start();
	}

}
