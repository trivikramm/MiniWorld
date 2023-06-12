import java.util.Scanner;

public class LoginPage {

    private static final String USERNAME = "johndoe";
    private static final String PASSWORD = "pass123";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.equals(USERNAME) && password.equals(PASSWORD)) {
            System.out.println("Access Granted! Welcome johndoe");
        } 
        else {
            System.out.println("Acess Denied! Invalid username or password.");
        }
    }
}
