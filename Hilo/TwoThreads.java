package Hilo;

public class TwoThreads implements Runnable {
	//@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("User: " + i + " Food type: " + Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		new Thread(new TwoThreads(), "Italian").start();
		new Thread(new TwoThreads(), "Spanish").start();
		new Thread(new TwoThreads(), "Chinese").start();
		new Thread(new TwoThreads(), "Japanese").start();
		System.out.println("End of Main");
	}

}
