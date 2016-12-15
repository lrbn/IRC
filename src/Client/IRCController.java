package Client;

import java.net.Socket;

/**
 * Client.IRCController.java
 *
 * I/O & networking control
 *
 * @author Brandon Nguyen
 *         Github @ lrbn
 *         Email: lrbn86@gmail.com
 *
 * @version December 13, 2016
 *
 */
public class IRCController {

    private Socket clientSocket;

    public void connectToServer() {

        clientSocket = new Socket();

    }

}