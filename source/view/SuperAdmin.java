package source.view;
import source.controller.AdminDb;
import source.model.Admin;
import java.sql.SQLException;
import java.util.Scanner;

public class SuperAdmin {
    private static final String username = "jeyakumar";
    private static final String password = "jeyakumar@123";
    private static Scanner ob = new Scanner(System.in);private static ValidationUtils check=new ValidationUtils();
    private static AdminDb adminDb;

    public static void show() throws SQLException {
        adminDb = new AdminDb();
        System.out.println("Admin Login");
        System.out.print("Enter username: ");
        String enteredUsername = ob.next();
        System.out.print("Enter password: ");
        String enteredPassword = ob.next();
        login(enteredUsername, enteredPassword);
    }

    public static void login(String enteredUsername, String enteredPassword) throws SQLException {
        if (username.equals(enteredUsername) && password.equals(enteredPassword)) {
            System.out.println("Login successful!");
            ad();
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public static void ad() throws SQLException {
        boolean s = true;
        while (s) {
            System.out.println("------------------------------------------------");
            System.out.println("1. Add Admin\n2. Delete Admin\n3. Display Admin\n4. Exit");
            System.out.println("------------------------------------------------");
            System.out.print("Enter your choice: ");
            int choice = ob.nextInt();
            ob.nextLine(); 
            System.out.println("------------------------------------------------");
            switch (choice) {
                case 1:
                    addAdmin();
                    break;
                case 2:
                    deleteAdmin();
                    break;
                case 3:
                    displayAdmin();
                    break;
                case 4:
                    s = false;
                    break;
                default:
                    System.out.println("Enter a valid choice:");
                    break;
            }
        }
    }

    private static void addAdmin() throws SQLException {
       
       String name = check.getValidName();
       String username = check.getValidUsername();
       long mobile = check.getValidMobile();
       System.out.println("Enter the travels name:");
       String travelsname=ob.nextLine();
       String mail = check.getValidEmail();
        String password = check.getValidPassword();
        Admin admin = new Admin(name, username, travelsname, mail, mobile, password);

        if (adminDb.addAdmin(admin) != 0) {
            System.out.println("Admin added successfully.");
        } else {
            System.out.println("Admin addition failed...");
        }
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }

    private static void deleteAdmin() throws SQLException {
        System.out.print("Enter the admin mail to delete: ");
        String adminMail = ob.nextLine();
        adminDb.deleteAdmin(adminMail);
    }

    private static void displayAdmin() throws SQLException {
        System.out.println("Admin List: ");
        for (String admin : adminDb.displayAdmin()) {
            System.out.println(admin);
        }
    }
}
