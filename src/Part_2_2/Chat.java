package Part_2_2;

import java.util.Scanner;

// Chat is a class that handles logic and user interaction with the program

class Chat
{
    Scanner scan = new Scanner(System.in);
    User newUser = new User();
    public Chat(){
        boolean exit = false;
        while(!exit) {
            scene();
            int answ;
            try
            {
                answ = scan.nextInt();
                if (answ == 1) {
                    newUser.createUser();
                } else if (answ == 2) {
                    newUser.messages.showMessages();
                } else if (answ == 3) {
                    newUser.sendText();
                } else if (answ == 4) {
                    newUser.sendContact();}
                else if (answ == 8) {
                    newUser.exportUsers();}
                else if (answ == 9) {
                    newUser.importUsersFromFile();
                } else if (answ == 0) {
                    System.out.println("\n\u001B[31m====Finishing your session====\u001B[0m\n");
                    exit = true;
                } else {
                    System.out.println("\n\u001B[31m====Thats not the proper answer====\u001B[0m\n");
                }
            } catch (Exception e) {
                System.out.println("\n\u001B[31m====Thats not the proper answer====\u001B[0m\n");
                throw new RuntimeException(e);
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
        3. Text message
        4. Contact message
        -
        8. File export users/chat
        9. Input users/chat from file 
        0. Exit
        \u001B[0m
        """);
    }
}
