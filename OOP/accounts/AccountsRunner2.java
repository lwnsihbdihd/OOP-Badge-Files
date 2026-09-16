package OOP.accounts;

import java.util.Scanner;

public class AccountsRunner2 {
    public static void main(String[] args) {
        // 5. Create two UserAccount variables `user1` and `user2` with usernames and passwords of your choosing. 
        //  Fill in the blank below for a program which asks the user for a username/password and checks 

        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");  
        String username = input.nextLine(); 
        System.out.print("Enter password: "); 
        String password = input.nextLine();

        UserAccount user1 = new UserAccount("bob", "strongestPassword123", "Male", 543);
        UserAccount user2 = new UserAccount("billy", "weakPassword", "Male", 8324);

        if (username.equals(user1.username) && password.equals(user1.password)) {
            System.out.println("Welcome " + username + "!");
        } else if (username.equals(user2.username) && password.equals(user2.password)) {
            System.out.println("Welcome " + user2.username + "!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

        input.close(); 
    }
}
