package Part_2_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.*;


// A collection with all my users
// and Users class is a part of the chat
public class Users{
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

    public void createUser(String name1, String password1)
    {
        User newUser = new User();
        newUser.name = name1;
        newUser.password = password1;
        addUser(newUser);
    }

    public void createUser()
    {
        User newUser = new User();
        System.out.println("\nEnter Name:");
        newUser.name = scan.nextLine();
        System.out.println("\nEnter password:");
        newUser.password = scan.nextLine();
        addUser(newUser);
    }

    public void exportUsers()
    {
        try {
            FileWriter writer = new FileWriter("usersOutput.txt");
            for (User user : userList) {
                writer.write(user.getUserInfo() + "\n");
            }
            writer.close();
            System.out.println("Users written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            throw new RuntimeException(e);
        }
    }

    public void importUsersFromFile()
    {
        String filename = "usersOutput.txt";
        try
        {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\|");
                String[] nameParts = parts[0].split(":");
                String[] passwordParts = parts[1].split(":");
                String name = nameParts[1].trim();
                String password = passwordParts[1].trim();

                User newUser = new User();
                newUser.name = name;
                newUser.password = password;
                userList.add(newUser);
            }
            System.out.println("\n\u001B[33m====You've successfully imported users====\u001B[0m");
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("\n\u001B[31m====Error importing from file - file not found====\u001B[0m");
            throw new RuntimeException(e);
        }
    }


    Scanner scan = new Scanner(System.in);

    // A method to go through users and login into one or create a new if the user does not exist yet
    public User logIn() {
        boolean loggedIn = false;
        User user = new User();
        // Ask user for a name input
        // Check if name is the same as we have in the System
        while (!loggedIn) {
            String name = null;
            boolean userFound = false;
            for (User i : userList) {
                if (i.name.equals(name)) {
                    String passwordIn = null;
                    if (passwordIn.equals(i.password)) {
                        System.out.println("You've successfully logged in");
                        loggedIn = true;
                        userFound = true;
                        user = i;
                        break;
                    } else {
                        System.out.println("Unsuccessful");
                    }
                }
            }
            // if we can't find user, simply ask if he/she (USER) wants to create a new one
            // and if we create a new one - we ask USER to login into created user
            if (!userFound) {
                int answ = 1;
                if (answ == 0) {
                    User newUser = new User();
                    String uname = null;
                    String upass = null;
                    System.out.println(uname + upass);
                    newUser.createUser(uname, upass);
                    userList.add(newUser);
                }
            }
        }
        return user; // in the end we return a user our USER wants to log into
    }
}

