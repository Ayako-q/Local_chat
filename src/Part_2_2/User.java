package Part_2_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class User extends Users
{
    protected String name;
    public String password;
    Messages messages = new Messages();
    Date date = new Date();
    Scanner scan = new Scanner(System.in);
    // simple method to add name and password to the
    public void createUser()
    {
        System.out.println("\nEnter Name:\n");
        this.name = scan.nextLine();
        System.out.println("\nEnter password:\n");
        this.password = scan.nextLine();
        System.out.println("\n\u001B[32m====User created====\u001B[0m\n");
        super.createUser();
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
}
