package Hilo;

public class ThreadPruebas extends Thread {

	public ThreadPruebas(String prueba) {
		super (prueba);
	}
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Index: " + i + " Food type: " + Thread.currentThread().getName());
			//System.out.println("End of thread" +  getName());
		}
	}
}
