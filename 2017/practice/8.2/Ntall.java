import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// DETTE ER NULL POENG Å GJOERE!!!
// Traadene ender opp med å vente <90% av tiden.

public class Ntall {

	public static void main(String[] args) {

		Tellemonitor monitor = new Tellemonitor();	

		for (int i = 0; i < 10; i++) {		
			TallTraad teller = new TallTraad(10000, 10, i, monitor);
			Thread traaden = new Thread(teller);
			traaden.start();	
		}
	
	}
}

class TallTraad implements Runnable {
	
	int maks = 1000;
	int n = 10;
	int start = 5;

	Tellemonitor monitor;
	//boolean go = true;

	TallTraad() {}
	TallTraad(int maks, int n, int start, Tellemonitor monitor) {
		this.maks = maks;
		this.n = n;
		this.start = start;

		this.monitor = monitor;	
	}

	public void run() {
		for (int i = start; i <= maks; i += n) {
			monitor.skrivUt(i);	
		}		
	}	
}

class Tellemonitor {
	
	private final Lock lock = new ReentrantLock();

	private int forrigeTall = 0;

	public synchronized void skrivUt(int tall) {
			
		try {
	  	while (tall != forrigeTall) {
				wait();

			}	
				forrigeTall++;	
				System.out.print(tall + " ");
				notifyAll();
			
		} catch (InterruptedException e) {}	
	}	
}

