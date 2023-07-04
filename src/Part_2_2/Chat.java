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
        JButton showChat = new JButton("Show messages");
        showChat.addActionListener(a -> newUser.logIn());

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

        System.out.println("""
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
        """);
    }
}
