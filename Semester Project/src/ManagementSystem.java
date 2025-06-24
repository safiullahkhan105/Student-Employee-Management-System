import java.util.*;
public class ManagementSystem {
    private List<Student> students = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    void addStudent() {
        System.out.print("Enter Name       : ");
        String name = scanner.nextLine();

        System.out.print("Enter Age        : ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Address    : ");
        String address = scanner.nextLine();

        System.out.print("Enter Student ID : ");
        String studentID = scanner.nextLine();

        System.out.print("Enter Major      : ");
        String major = scanner.nextLine();

        students.add(new Student(name, age, address, studentID, major));
        System.out.println("Student Added Successfully");

    }
    void addEmployee() {
        System.out.print("Enter Name        : ");
        String name = scanner.nextLine();

        System.out.print("Enter Age         : ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Address     : ");
        String address = scanner.nextLine();

        System.out.print("Enter Employee ID : ");
        String employeeID = scanner.nextLine();

        System.out.print("Enter Department  : ");
        String department = scanner.nextLine();

        employees.add(new Employee(name, age, address, employeeID, department));
        System.out.println("Employee Added Successfully ");

    }
    void displayAllStudent() {
        if (students.isEmpty()) {
            System.out.println("No Student founds ");
        }
        for (Student student : students) {
            student.displayInfo();
            System.out.println("_______________________");
        }
    }
    void displayAllEmployee() {
        if (employees.isEmpty()) {
            System.out.println("No Employee founds ");
        }
        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println("_________________________");
        }
    }
    void updateStudent() {
        System.out.print("Enter Student ID to update : ");
        String enteredID = scanner.nextLine();
        for (Student student : students) {
            if (enteredID.equals(student.studentID)) {
                System.out.print("Enter New Name    : ");
                String name = scanner.nextLine();

                System.out.print("Enter New Age     : ");
                int age = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter New Address : ");
                String address = scanner.nextLine();

                System.out.print("Enter New Major   : ");
                String major = scanner.nextLine();

                student.updateInfo(name, age, address, major);
                System.out.println("Student updated successfully!");
            }
        }
        System.out.println("Student not found.");
    }
    void updateEmployee() {
        System.out.print("Enter Employee ID to update : ");
        String enteredID = scanner.nextLine();
        for (Employee employee : employees) {
            if (enteredID.equals(employee.employeeID)){
                System.out.print("Enter New Name    : ");
                String name = scanner.nextLine();

                System.out.print("Enter New Age     : ");
                int age = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter New Address : ");
                String address = scanner.nextLine();

                System.out.print("Enter New Major   : ");
                String major = scanner.nextLine();

                employee.updateInfo(name, age, address, major);
                System.out.println("Employee updated successfully!");
            }
        }
        System.out.println("Employee not found.");
    }
    public void deleteStudent() {
        System.out.print("Enter the ID of the student to delete. ");
        String inputID = scanner.nextLine();

        boolean isRemoved = false;
        for (Student student : students) {
            if (student.studentID.equals(inputID)) {
                students.remove(student);
                isRemoved = true;
                break;
            }
        }

        if (isRemoved) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
    public void deleteEmployee() {
        System.out.print("Enter the ID of the employee to delete. ");
        String inputID = scanner.nextLine();

        boolean isRemoved = false;
        for (Employee employee : employees) {
            if (employee.employeeID.equals(inputID)) {
                employees.remove(employee);
                isRemoved = true;
                break;
            }
        }

        if (isRemoved) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}

