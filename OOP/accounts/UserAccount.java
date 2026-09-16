package OOP.accounts;
import java.util.Scanner;

public class UserAccount {
    // 1. Fill out the properties
    public String username; 
    public String password; 
    public String gender;
    public int age;

    Scanner scanner = new Scanner(System.in);

    // 2. Write constructor for UserAccount
    public UserAccount(String username, String password, String gender, int age) {
        this.username = username; 
        this.password = password; 
        this.gender = gender;
        this.age = age;
    }

    // 3. Write your methods here

    public void comment() {
        System.out.println("Write your comment: ");
        String comment = scanner.nextLine();
        System.out.println("Your comment: " + comment);
        
    }

    public String resetPassword(String password) {
        System.out.println("Write your new password: ");
        password = scanner.nextLine();
        System.out.println("Your new password: " + password);
        scanner.close();
        return password;
    }
    
}
