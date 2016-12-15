package Client;

/**
 * Client.IRC.java
 *
 * IRC Client
 *
 * @author Brandon Nguyen
 *         Github @ lrbn
 *         Email: lrbn86@gmail.com
 *
 * @version December 13, 2016
 *
 */
public class IRC {

    public static void main(String[] args) {

        IRCModel model = new IRCModel();
        IRCView view = new IRCView();

        new IRCController(model, view);

    }

}