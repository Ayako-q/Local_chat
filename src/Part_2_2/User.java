package Part_2_2;

import java.util.Scanner;
import java.util.Date;
public class User extends Users
{
    protected String name;
    public String password;
    Date date = new Date();
    Scanner scan = new Scanner(System.in);
    @Override
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
        String dateSent = String.valueOf(date.getTime());
        TextMessage tnew = new TextMessage(dateSent, name, text);
        tnew.addMessage(tnew);
        System.out.println("Ypur messages:\n");
        tnew.showMessages();
    }
}
