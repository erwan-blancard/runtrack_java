public class SimpleThreadExercice {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				int i = 0;
				while (i < 5) {
					System.out.println("Salut du thread!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					i++;
				}
			}
			
		});
		thread.start();
	}

}