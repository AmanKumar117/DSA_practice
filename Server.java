import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Define the server's port number
            int serverPort = 12345;

            // Create a server socket and start listening on the specified port
            ServerSocket serverSocket = new ServerSocket(serverPort);
            System.out.println("Server started. Waiting for connections...");

            // Accept incoming client connections
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

            // Create input and output streams for sending/receiving data
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Receive the message from the client
            String message = in.readLine();
            System.out.println("Received message from client: " + message);

            // Send an acknowledgement back to the client
            String acknowledgement = "Message received!";
            out.println(acknowledgement);

            // Close the streams and sockets
            out.close();
            in.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
