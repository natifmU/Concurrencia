package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable{
	
	private Socket clientSocket;
	
	public Server(Socket clientSocket) {
		this.clientSocket = clientSocket;
		
	}

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(5001);
			System.out.println("Chat server started.");
			
			int i = 0;
			while (true) {
				
				Socket clientSocket2 = serverSocket.accept();
				System.out.println("Connected client from " + clientSocket2.getInetAddress());
				i++;
				new Thread(new Server(clientSocket2), "Client " + i).start();
				
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		String inputLine;
		
		try {
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			out.println("Welcome to your restaurant chooser");
			out.println("Tell me, what's your favorite food?: ");
			
			while ((inputLine = in.readLine()) != null) {
				System.out.println("The user has chosen this: " + inputLine);
				
				if (inputLine.equals("q")) {
					clientSocket.close();
					break;
				}
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
