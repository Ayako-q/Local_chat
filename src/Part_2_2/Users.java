package Part_2_2;

import java.util.ArrayList;
import java.util.Scanner;

// A collection with all my users
public class Users {
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
        Users newUser = new Users();
    }

    Scanner scan = new Scanner(System.in);

    public User logIn() {
        boolean loggedIn = false;
        User user = new User();
        // Ask user for a name input
        // Check if name is the same as we have in the System
        while (!loggedIn) {
            System.out.println("\nEnter name:");
            String name = scan.nextLine();
            boolean userFound = false;
            for (User i : userList) {
                if (i.name.equals(name)) {
                    System.out.println("\nEnter password:");
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
        return user;
    }
}

