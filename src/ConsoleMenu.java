
import java.util.Scanner;

public class ConsoleMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company company = new Company("Business Gnómes Ltd");

        Manager manager = new Manager("ManagerName", "manager@example.com", "Gnomeo", "smurf");

        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Compare input credentials with the Manager's credentials
        if (!username.equals(manager.getUsername()) || !password.equals(manager.getPassword())) {
            System.out.println("Incorrect login details.");
            return;
        }

        while (true) {
            System.out.println("\n1. Add New Staff\n2. View Staff\n3. Remove Staff\n4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    String email;
                    while (true) {
                        System.out.print("Enter email: ");
                        email = scanner.nextLine();
                        if (email.contains("@")) {
                            break; // Breaks out of the loop if email is valid
                        } else {
                            System.out.println("Error: Email must contain an '@' symbol. Please enter a valid email.");
                        }
                    }
                    Employee newEmployee = new Employee(name, email);
                    company.addNewStaff(newEmployee);
                    System.out.println("New staff added.");
                    break;
                case 2:
                    System.out.println("Current staff:");
                    company.listEmployees(0); // Assuming 0 lists all
                    break;
                case 3:
                    System.out.print("Enter employee number to remove: ");
                    int empNum = scanner.nextInt();
                    company.removeStaff(empNum);
                    System.out.println("Staff removed.");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
