package Part_2_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;


public class User extends Users
{
    protected String name;
    public String password;
    Messages messages = new Messages();
    Date date = new Date();
    Scanner scan = new Scanner(System.in);
    // simple method to add name and password to the
    @Override
    public void createUser(String name, String password)
    {
        super.createUser(name, password);
        System.out.println("\n\u001B[32m====User created====\u001B[0m\n");
    }

    public String getUserInfo() {
        return "User name: " + name + "| user password: " + password;
    }
    public void sendText()
    {
        User ourUser = logIn();
        String name = ourUser.name;
        System.out.println("Enter your text message below:\n");
        String text = scan.nextLine();
        // Saving time the message was sent:
        Date sentTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateSent = dateFormat.format(sentTime);
        // creating a new TextMessage and adding it to messages
        BaseMessage tnew = new TextMessage(dateSent, name, text);
        messages.addMessage(tnew);
        System.out.println("Your messages:\n");
        messages.showMessages();
    }

    public void sendContact()
    {
        User ourUser = logIn();
        String name = ourUser.name;
        // Ask for contact name
        System.out.println("\nEnter contact name:");
        String contactName = scan.nextLine();
        // Ask for contact number
        System.out.println("\nEnter contact phone number:");
        String contactNum = scan.nextLine();

        // Saving time the message was sent:
        Date sentTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateSent = dateFormat.format(sentTime);
        // creating a new TextMessage and adding it to messages
        BaseMessage tnew = new ContactMessage(dateSent, name, contactName, contactNum);
        messages.addMessage(tnew);
        System.out.println("Your messages:\n");
        messages.showMessages();
    }
}
