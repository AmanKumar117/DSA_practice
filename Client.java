import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Define the server's IP address and port number
            String serverIP = "127.0.0.1";
            int serverPort = 12345;

            // Create a socket and connect to the server
            Socket socket = new Socket(serverIP, serverPort);

            // Create input and output streams for sending/receiving data
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Send a message to the server
            String message = "Hello, server!";
            out.println(message);

            // Receive the acknowledgement from the server
            String acknowledgement = in.readLine();
            System.out.println("Server response: " + acknowledgement);

            // Close the streams and socket
            out.close();
            in.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
