package Part_2_2;

import java.awt.*;
import java.util.Scanner;
import javax.swing.*;


// Chat is a class that handles logic and user interaction with the program

class Chat
{
    Scanner scan = new Scanner(System.in);
    User newUser = new User();
    public Chat(){
        scene();
        boolean exit = false;
    }

    //
    public void scene()
    {
        JFrame mainWindow = new JFrame();
        mainWindow.setSize(800, 600);
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        GridLayout gridLayout = new GridLayout(4, 2);
        panel.setLayout(gridLayout);

        // Adding buttons with functionality (they call local functions of User class)

        JButton userCreate = new JButton("Create new user");

        userCreate.addActionListener(a ->
                newUser.createUser(JOptionPane.showInputDialog(panel, "Enter new users name").toString(),
                        JOptionPane.showInputDialog(panel, "Enter new users password").toString(), panel)
        );

        JButton showChat = new JButton("Show messages");
        showChat.addActionListener(a -> chatWindow(newUser.logIn()));

        JButton sendMessage = new JButton("Send a new message");
        sendMessage.addActionListener(a -> newUser.sendText());

        JButton sendContact = new JButton("Send a contact message");
        sendContact.addActionListener(a -> newUser.sendContact());

        JButton exportChat = new JButton("Chat export");
        exportChat.addActionListener(a -> newUser.messages.exportChat());

        JButton exportUsers = new JButton("Users export");
        exportUsers.addActionListener(a -> newUser.exportUsers());

        JButton usersImport = new JButton("Users import");
        usersImport.addActionListener(a -> newUser.importUsersFromFile());

        JButton exit = new JButton("Exit");
        exit.addActionListener(a -> System.exit(1));

        // addings those buttons to the scene
        panel.add(userCreate);
        panel.add(showChat);
        panel.add(sendMessage);
        panel.add(sendContact);
        panel.add(exportChat);
        panel.add(exportUsers);
        panel.add(usersImport);
        panel.add(exit);

        // adding scene to the main window
        mainWindow.add(panel);
        // Setting main window visible
        mainWindow.setVisible(true);
        /*System.out.println("""
        \n\u001B[33m
        Hi, this is your chat! What would you like to do?
        1. Create user
        2. Show my chats
        3. Text message
        4. Contact message
        -
        6. Chats export
        7. Chats import
        8. Users export
        9. Users import
        0. Exit
        \u001B[0m
        """);*/
    }
    public void chatWindow(User someUser)
    {
        // creating a new frame
        JFrame chatFrame = new JFrame();
        chatFrame.setSize(300, 800);
        chatFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        GridLayout box = new GridLayout(1, 3);

        // Button that will close additional window
        JButton back = new JButton("Back");
        back.addActionListener(a -> chatFrame.getDefaultCloseOperation());

        // Calling function to show chat messages and adding it to the panel
        JLabel messages = newUser.messages.showMessages();

        JLabel userInfo = new JLabel("User: " + newUser.name);

        mainPanel.add(userInfo);
        mainPanel.add(messages);
        mainPanel.add(back);

        // Add panel to the frame and set it visible
        chatFrame.add(mainPanel);
        chatFrame.setVisible(true);
    }
}
