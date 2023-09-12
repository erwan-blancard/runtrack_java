import java.util.concurrent.locks.ReentrantLock;

public class LockExercice {
	
	private static int solde = 0;
	private static int montantRetrait = 0;
	
	private static ReentrantLock lock = new ReentrantLock();
	
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
			solde = Integer.parseInt(args[0]);
			montantRetrait = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			System.out.println("Argument(s) invalide(s).");
			System.exit(1);
		}

		Thread thread1 = new Thread(() -> retrait("Thread 1"));
		Thread thread2 = new Thread(() -> retrait("Thread 2"));
		thread1.start();
		thread2.start();
		
		while (thread1.isAlive() || thread2.isAlive()) {}
		
		System.out.println("Solde final: "+solde);
	}
	
	private static void retrait(String threadName) {
		lock.lock();
	    try {
	    	if (solde-montantRetrait < 0) {
				System.out.println(threadName+": Retrait impossible: pas assez de fonds.");
			} else {
				solde -= montantRetrait;
				System.out.println(threadName+" a retiré "+montantRetrait+".");
			}
	    } finally {
	        lock.unlock();
	    }
	}

}
