package studentManagement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        Student student = new Student(name);

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Enroll in a course");
            System.out.println("2. View balance");
            System.out.println("3. Pay tuition fees");
            System.out.println("4. Show status");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter course name to enroll: ");
                    String course = scanner.nextLine();
                    student.enrollCourse(course);
                    break;
                case 2:
                    student.viewBalance();
                    break;
                case 3:
                    System.out.print("Enter amount to pay: $");
                    int amount = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    student.payTuitionFees(amount);
                    break;
                case 4:
                    student.showStatus();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            scanner.close();
        }
        
        
	}

}
