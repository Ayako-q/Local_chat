package Part_2_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class User extends Users
{
    protected String name;
    public String password;
    Date date = new Date();
    Scanner scan = new Scanner(System.in);
    public void createUser()
    {
        System.out.println("Enter Name:\n");
        this.name = scan.nextLine();
        System.out.println("Enter password:\n");
        this.password = scan.nextLine();
        System.out.println("User created");
        super.createUser();
    }

    public void sendText()
    {
        System.out.println("Enter your text message below:\n");
        String text = scan.nextLine();
        // Saving time the message was sent:
        Date sentTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateSent = dateFormat.format(sentTime);
        // creating a new TextMessage and adding it to messages
        TextMessage tnew = new TextMessage(dateSent, name, text);
        tnew.addMessage(tnew);
        System.out.println("Your messages:\n");
        tnew.showMessages();
    }
}
