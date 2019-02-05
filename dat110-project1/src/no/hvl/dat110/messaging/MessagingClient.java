package no.hvl.dat110.messaging;

import java.io.IOException;

import java.net.Socket;
import java.net.UnknownHostException;

public class MessagingClient {

	private String server;
	private int port;

	public MessagingClient(String server, int port) {
		this.server = server;
		this.port = port;
	}

	// connect to messaging server
	public Connection connect() {
		Connection connection;
		try {
			Socket clientSocket = new Socket(server, port); //lage socket
			connection = new Connection(clientSocket); //koble socket
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		// TODO
		// create TCP socket for client and connection

		if (true) {
			throw new RuntimeException("not yet implemented");
		}

		return connection;
	}
}
