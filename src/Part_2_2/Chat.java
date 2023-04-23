package Part_2_2;

import java.util.Scanner;

// Chat is a class that handles logic and user interaction with the program

class Chat
{
    Scanner scan = new Scanner(System.in);
    User newUser = new User();
    public Chat(){
        while(true)
        {
            scene();
            int answ = scan.nextInt();
            if(answ == 1)
            {
                newUser.createUser();
            }
            else if (answ == 2)
            {
                newUser.messages.showMessages();
            }
            else if (answ == 3)
            {
                newUser.sendText();
            }
            else if (answ == 4)
            {
                newUser.sendText();
            }
        }
    }

    //
    public void scene()
    {
        System.out.println("""
        \n\u001B[33m
        Hi, this is your chat! What would you like to do?
        1. Create user
        2. Show my chats
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
