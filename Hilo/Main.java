package Hilo;

public class Main {

	public static void main(String[] args) {
		new ThreadPruebas("Thread 1").start();
		new ThreadPruebas("Thread 2").start();
		
		System.out.println("End of Main");

	}

}
