package OOP.accounts;
import java.util.Scanner;

import OOP.accounts.UserAccount;

public class AccountsRunner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 4. Fill in the blanks below for Bill, a UserAccount with username 'bill' and password 'Password123'. 
        //  Then, write a program which involves calling both of Bill's methods.  
        UserAccount bill = new UserAccount("bill", "Password123", "Male", 24); 
        bill.comment();
        bill.password = bill.resetPassword(bill.password);
        // 5. After all of that, create another user. Fill in the blank below for a program which asks the user for a username/password, and checks 
        System.out.println("Enter username: ");
        String username1 = scanner.nextLine();
        System.out.println("Enter password: ");
        String password1 = scanner.nextLine();
        System.out.println("Enter gender: ");
        String gender1 = scanner.nextLine();
        System.out.println("Enter age: ");
        int age1 = scanner.nextInt();
        
        UserAccount user1 = new UserAccount(username1, password1, gender1, age1); 
    }
}


