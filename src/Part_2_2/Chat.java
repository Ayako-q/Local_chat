package Part_2_2;

import java.util.Scanner;

class Chat
{
    Scanner scan = new Scanner(System.in);
    public Chat(Users b){
        while(true)
        {
            scene();
            int answ = scan.nextInt();
            if(answ == 1)
            {
                b.logIn();
            }
            else if (answ == 2)
            {

            }
            else if (answ == 3)
            {
                b.logIn().sendText();
            }
        }
    }

    public void scene()
    {
        System.out.println("""
        \n\u001B[33m
        Hi, this is your chat! What would you like to do?
        1. Login
        2. Show my chat
        3. Textmessage
        4. Voice message
        5. Image
        6. LocationMessage
        7. ContactMessage
        8. File
        \u001B[0m
        """);
    }

    public void ShowTextMessages()
    {

    }

    public void log()
    {

    }
}
