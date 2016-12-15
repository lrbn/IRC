package Client;

import java.io.IOException;
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

    private IRCModel model;
    private IRCView view;

    private Socket clientSocket;
    private String serverHostName;
    private int serverPortNumber;

    public IRCController(IRCModel model, IRCView view) {

        this.model = model;
        this.view = view;

        connectToServer(model.getServerHostName(), model.getServerPortNumber());

    }

    public void connectToServer(String serverHostName, int serverPortNumber) {

        this.serverHostName = serverHostName;
        this.serverPortNumber = serverPortNumber;

        try {

            clientSocket = new Socket(serverHostName, serverPortNumber);



        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void storeDataToModel (IRCModel model, IRCView view) {

        model.setUsername(view.getUsernameField().getText());
        model.setServerHostName(view.getServerHostNameField().getText());
        model.setServerPortNumber(Integer.parseInt(view.getServerPortNumberField().getText()));

    }

}