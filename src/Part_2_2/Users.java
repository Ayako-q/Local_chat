package Part_2_2;

import java.util.ArrayList;
import java.util.Scanner;

// A collection with all my users
// Users are part of the chat
public class Users extends Chat{
    private int i = 0; // number of users
    private ArrayList<User> userList;

    public Users() {
        userList = new ArrayList<User>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user) {
        userList.remove(user);
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void createUser() {
        User newUser = new User();
        addUser(newUser);
    }

    Scanner scan = new Scanner(System.in);

    // A method to go through users and login into one or create a new if the user does not exist yet
    public User logIn() {
        boolean loggedIn = false;
        User user = new User();
        // Ask user for a name input
        // Check if name is the same as we have in the System
        while (!loggedIn) {
            System.out.println("Enter name:\n");
            String name = scan.nextLine();
            boolean userFound = false;
            for (User i : userList) {
                if (i.name.equals(name)) {
                    System.out.println("Enter password:\n");
                    String passwordIn = scan.nextLine();
                    if (passwordIn.equals(i.password)) {
                        System.out.println("\nYou've successfully logged in!");
                        loggedIn = true;
                        userFound = true;
                        user = i;
                        break;
                    } else {
                        System.out.println("\n\u001B[31mPassword incorrect!\u001B[0m");
                    }
                }
            }
            // if we can't find user, simply ask if he/she (USER) wants to create a new one
            // and if we create a new one - we ask USER to login into created user
            if (!userFound) {
                System.out.println("\nName incorrect, want to create such user? Type Y/N");
                String answ = scan.nextLine();
                if (answ.toLowerCase().equals("y")) {
                    User newUser = new User();
                    newUser.createUser();
                    userList.add(newUser);
                }
            }
        }
        return user; // in the end we return a user our USER wants to log into
    }
}
