package Hilo;

public class TwoThreads implements Runnable {
	//@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			//System.out.println(i + " " + Thread.currentThread().getName());
			//System.out.println("End of Thread" +  Thread.currentThread().getName());
			System.out.println("Index: " + i + " Thread Name: " + Thread.currentThread().getName());
		}
	}
	
	public static void Main(String[] args) {
		new Thread(new TwoThreads(), "Thread 1").start();
		new Thread(new TwoThreads(), "Thread 2").start();
		new Thread(new TwoThreads(), "Thread 3").start();
		new Thread(new TwoThreads(), "Thread 4").start();
		System.out.println("End of Main");
	}

}
