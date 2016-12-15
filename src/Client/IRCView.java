package Client;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Client.IRCView.java
 *
 * Visual representation of client
 *
 * @author Brandon Nguyen
 *         Github @ lrbn
 *         Email: lrbn86@gmail.com
 *
 * @version December 13, 2016
 *
 */
public class IRCView extends JFrame {

    public static final String TITLE = "IRC";
    public static final int WIDTH = 600;
    public static final int HEIGHT = 480;

    private JLabel usernameLabel;
    private JLabel serverHostNameLabel;
    private JLabel serverPortNumberLabel;
    private JLabel serverMessageLabel;

    private JTextField usernameField;
    private JTextField serverHostNameField;
    private JTextField serverPortNumberField;

    private JLabel usersLabel;
    private JTextArea chatBox; // User sends messages
    private JTextArea messagesBox; // User reads messages

    private JButton joinServerButton;
    private JButton sendMessageButton;

    private JPanel mainPanel;
    private JPanel loginPanel;
    private JPanel chatPanel;

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

        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEtchedBorder());
        mainPanel.add(setupLoginPanel(), BorderLayout.SOUTH);
        mainPanel.add(setupChatPanel());

        return this.mainPanel;
    }

    public JPanel setupLoginPanel() {

        loginPanel = new JPanel();
        loginPanel.setBorder(BorderFactory.createEtchedBorder());
        loginPanel.setLayout(new GridLayout(4, 3));

        usernameLabel = new JLabel("Username: ");
        usernameField = new JTextField(8);
        serverHostNameLabel = new JLabel ("Server Host Name: ");
        serverHostNameField = new JTextField(8);
        serverPortNumberLabel = new JLabel("Server Port Number: ");
        serverPortNumberField = new JTextField(8);
        joinServerButton = new JButton("Join Server");

        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);

        loginPanel.add(serverHostNameLabel);
        loginPanel.add(serverHostNameField);

        loginPanel.add(serverPortNumberLabel);
        loginPanel.add(serverPortNumberField);

        loginPanel.add(joinServerButton);

        joinServerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String emptyField = "";
                String getUserNameFieldText = usernameField.getText();
                String getServerHostNameFieldText = serverHostNameField.getText();
                String getServerPortNumberFieldText = serverPortNumberField.getText();
                boolean isFieldsEmpty = (getUserNameFieldText.equals(emptyField)) || (getServerHostNameFieldText.equals(emptyField)) || (getServerPortNumberFieldText.equals(emptyField));

                if (!isFieldsEmpty) {
                    System.out.println("All fields are filled. Storing data.");
                    // Check whether fields are valid

                    // Store data into model



                } else {
                    System.out.println("Fields cannot be empty.");
                }
            }
        });

        return this.loginPanel;
    }

    public JPanel setupChatPanel() {

        chatPanel = new JPanel();

        return this.chatPanel;
    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(JTextField usernameField) {
        this.usernameField = usernameField;
    }

    public JTextField getServerHostNameField() {
        return serverHostNameField;
    }

    public void setServerHostNameField(JTextField serverHostNameField) {
        this.serverHostNameField = serverHostNameField;
    }

    public JTextField getServerPortNumberField() {
        return serverPortNumberField;
    }

    public void setServerPortNumberField(JTextField serverPortNumberField) {
        this.serverPortNumberField = serverPortNumberField;
    }

    public JTextArea getChatBox() {
        return chatBox;
    }

    public void setChatBox(JTextArea chatBox) {
        this.chatBox = chatBox;
    }

    public JTextArea getMessagesBox() {
        return messagesBox;
    }

    public void setMessagesBox(JTextArea messagesBox) {
        this.messagesBox = messagesBox;
    }
}