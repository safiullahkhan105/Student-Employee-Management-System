import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginFrame());
    }
}

class LoginFrame extends JFrame {
    JTextField usernameField;
    JPasswordField passwordField;
    JLabel statusLabel;
    public LoginFrame() {
        setTitle("Login Student & Employee Management System");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        JLabel title = new JLabel("Safii + Meena Login");
        title.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel userLabel = new JLabel("👤 Username:");
        usernameField = new JTextField(15);

        JLabel passLabel = new JLabel("🔑 Password:");
        passwordField = new JPasswordField(15);

        JButton loginButton = new JButton("Login ");
        statusLabel = new JLabel("");
        loginButton.addActionListener(e -> checkLogin());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);

        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        add(title, gbc);

        gbc.gridy++;
        gbc.gridwidth = 1;
        add(userLabel, gbc);

        gbc.gridx = 1;
        add(usernameField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(passLabel, gbc);

        gbc.gridx = 1;
        add(passwordField, gbc);

        gbc.gridx = 0; gbc.gridy++; gbc.gridwidth = 2;
        add(loginButton, gbc);

        gbc.gridy++;
        add(statusLabel, gbc);

        setVisible(true);
    }
    private void checkLogin() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (username.equals("admin") && password.equals("1121")) {
            dispose();
            runConsoleApp();
        } else {
            statusLabel.setText("❌ Invalid login. Try again.");
            statusLabel.setForeground(Color.RED);
        }
    }
    private void runConsoleApp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║      ╔═╗ ╔═╗ ╔╦╗ ╦ ╔═╗ ╔═╗   ╔╦╗   ╔═╗ ╔╦╗ ╔═╗ ╔╗╔ ╔═╗     ║");
        System.out.println("║      ║   ║╣   ║║ ║ ║   ║╣     ║║   ║╣   ║║ ║╣  ║║║ ║ ╦     ║");
        System.out.println("║      ╚═╝ ╚═╝ ═╩╝ ╩ ╚═╝ ╚═╝   ╩ ╩   ╚═╝ ═╩╝ ╚═╝ ╝╚╝ ╚═╝     ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");

        ManagementSystem system = new ManagementSystem();

        while (true) {
            System.out.println("\n╔════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                   ✨✨  SYSTEM MAIN MENU  ✨✨                      ║");
            System.out.println("╠══════════════════════════════════════════════════════════==══════════╣");
            System.out.println("║  1️⃣   📘  ➤  Add Student                                            ║");
            System.out.println("║  2️⃣   💼  ➤  Add Employee                                           ║");
            System.out.println("║  3️⃣   🧑‍🎓  ➤  Display All Students                                 ║");
            System.out.println("║  4️⃣   👨‍💼  ➤  Display All Employees                                  ║");
            System.out.println("║  5️⃣   ✏   ➤  Update Student                                        ║");
            System.out.println("║  6️⃣   🛠   ➤  Update Employee                                       ║");
            System.out.println("║  7️⃣   ❌  ➤  Delete Student                                         ║");
            System.out.println("║  8️⃣   🗑   ➤  Delete Employee                                        ║");
            System.out.println("║  9️⃣   🚪  ➤  Exit                                                   ║");
            System.out.println("╚═════════════════════════════════════════════════════════════════==═══╝");
            System.out.print("👉 Please enter your choice (1-9): ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input. Please enter a number between 1 and 9.");
                scanner.nextLine();
                continue;
            }

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("🔹 Adding a new student...");
                    system.addStudent();
                    break;
                case 2:
                    System.out.println("🔹 Adding a new employee...");
                    system.addEmployee();
                    break;
                case 3:
                    System.out.println("📋 All Students:");
                    system.displayAllStudent();
                    break;
                case 4:
                    System.out.println("📋 All Employees:");
                    system.displayAllEmployee();
                    break;
                case 5:
                    System.out.println("✏ Updating student...");
                    system.updateStudent();
                    break;
                case 6:
                    System.out.println("✏ Updating employee...");
                    system.updateEmployee();
                    break;
                case 7:
                    System.out.println("🗑 Deleting student...");
                    system.deleteStudent();
                    break;
                case 8:
                    System.out.println("🗑 Deleting employee...");
                    system.deleteEmployee();
                    break;
                case 9:
                    LocalDateTime now = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy - hh:mm a");
                    System.out.println("\n👋 Exiting... Thank you for using the Safii + Meena Management System!");
                    System.out.println("🕒 Logged out at: " + now.format(formatter));
                    System.out.println("💖 Stay safe and take care!");
                    return;
                default:
                    System.out.println("❌ Invalid choice. Please enter a number between 1 and 9.");
                    break;
            }
        }
    }
}


//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Login into Management System");
//        System.out.print("Username : ");
//        String username = scanner.nextLine();
//        System.out.print("Password : ");
//        String password = scanner.nextLine();
//
//        if (username.equals("admin") && password.equals("1121")) {
//
//            System.out.println("Welcome to the Management System Menu ");
//
//            ManagementSystem system = new ManagementSystem();
//
//            while (true) {
//
//                System.out.println("===== SYSTEM MAIN MENU =====");
//                System.out.println("1. Add Student");
//                System.out.println("2. Add Employee");
//                System.out.println("3. Display All Students");
//                System.out.println("4. Display All Employees");
//                System.out.println("5. Update Student");
//                System.out.println("6. Update Employee");
//                System.out.println("7. Delete Student");
//                System.out.println("8. Delete Employee");
//                System.out.println("9. Exit");
//                System.out.print("Please enter your choice (1-9): ");
//
//                int choice;
//                try {
//                    choice = scanner.nextInt();
//                }
//                catch (InputMismatchException e){
//                    System.out.println("Invalid input. Please enter a number between 1 and 9.");
//                    scanner.nextLine();
//                    continue;
//                }
//
//                System.out.println();
//
//                switch (choice) {
//                    case 1:
//                        System.out.println("Adding a new student...");
//                        system.addStudent();
//                        break;
//                    case 2:
//                        System.out.println("Adding a new employee...");
//                        system.addEmployee();
//                        break;
//                    case 3:
//                        System.out.println("All Students...");
//                        system.displayAllStudent();
//                        break;
//                    case 4:
//                        System.out.println("All Employees...");
//                        system.displayAllEmployee();
//                        break;
//                    case 5:
//                        System.out.println("Updating student...");
//                        system.updateStudent();
//                        break;
//                    case 6:
//                        System.out.println("Updating employee...");
//                        system.updateEmployee();
//                        break;
//                    case 7:
//                        System.out.println("Deleting student...");
//                        system.deleteStudent();
//                        break;
//                    case 8:
//                        System.out.println("Deleting employee...");
//                        system.deleteEmployee();
//                        break;
//                    case 9:
//                        System.out.println("Exiting...");
//                        return;
//                    default:
//                        System.out.println("Invalid choice. Please enter a number between 1 and 9.");
//                        break;
//                }
//            }
//        }
//        else {
//            System.out.println("Invalid login. Access denied!");
//        }
//        scanner.close();
//    }
//}


