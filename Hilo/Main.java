package Hilo;

public class Main {

	public static void main(String[] args) {
		new ThreadPruebas("Italian").start();
		new ThreadPruebas("Spanish").start();
		new ThreadPruebas("Chinese").start();
		new ThreadPruebas("Japanese").start();
		
		System.out.println("End of Main");

	}

}
