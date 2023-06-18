import java.util.Scanner;

public class SignupPage {
    private static String[] usernames = new String[100];
    private static String[] passwords = new String[100];
    private static int userCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Signup Page!");
        System.out.print("Enter your desired username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your desired password: ");
        String password = scanner.nextLine();

        while (isUsernameTaken(username)) {
            System.out.println("Username already taken. Please choose a different username.");
            System.out.print("Enter your desired username: ");
            username = scanner.nextLine();
        }

        insertUser(username, password);
        System.out.println("Signup successful!");
    }

    private static boolean isUsernameTaken(String username) {
        for (int i = 0; i < userCount; i++) {
            if (usernames[i].equals(username)) {
                return true;
            }
        }
        return false;
    }

    private static void insertUser(String username, String password) {
        usernames[userCount] = username;
        passwords[userCount] = password;
        userCount++;
    }
}
