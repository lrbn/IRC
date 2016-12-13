package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server.IRCServer.java
 *
 * IRC Server
 *
 * @author Brandon Nguyen, lrbn@github.com, lrbn86@gmail.com
 *
 * @version December 13, 2016
 *
 */
public class IRCServer {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private int serverPort;

    public IRCServer(int serverPort) throws IOException {

        this.serverPort = serverPort;

        try {

            System.out.println("IRC Server has started.");
            System.out.println("Listening on port: " + serverPort);
            serverSocket = new ServerSocket(serverPort);
            System.out.println("Waiting for client connections...");
            clientSocket = serverSocket.accept();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                serverSocket.close();
            }
            if (clientSocket != null) {
                clientSocket.close();
            }
        }

    }

    // Start server through terminal
    public static void main(String[] args) throws IOException {
        new IRCServer(Integer.parseInt(args[0]));
    }

}














