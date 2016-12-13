package Client;

import javax.swing.*;
import java.awt.*;

/**
 * Client.IRCView.java
 *
 * Visual representation of client
 *
 * @author Brandon Nguyen, lrbn@github.com, lrbn86@gmail.com
 *
 * @version December 13, 2016
 *
 */
public class IRCView extends JFrame {

    public static final String TITLE = "IRC";
    public static final int WIDTH = 600;
    public static final int HEIGHT = 480;

    private JLabel usernameLabel;
    private JTextField usernameField;

    private JButton loginButton;
    private JButton sendMessageButton;

    private JPanel loginPanel;
    private JPanel chatPanel;
    private JPanel mainPanel;

    public IRCView() {

        setTitle(TITLE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        add(setupGUI());
        pack();
        setVisible(true);

    }

    public JPanel setupGUI() {

        mainPanel = new JPanel();
        mainPanel.add(setupLoginPanel());
        mainPanel.add(setupChatPanel());

        return this.mainPanel;
    }

    public JPanel setupLoginPanel() {

        loginPanel = new JPanel();
        usernameLabel = new JLabel("Username: ");
        usernameField = new JTextField(8);
        loginButton = new JButton("Login");

        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(loginButton);

        return this.loginPanel;
    }

    public JPanel setupChatPanel() {

        chatPanel = new JPanel();

        return this.chatPanel;
    }

}