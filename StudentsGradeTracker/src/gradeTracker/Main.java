package gradeTracker;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Student Grade Tracker");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade");
            System.out.println("3. Calculate Average Grade");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addStudent(students, scanner);
                    break;
                case 2:
                    addGrade(students, scanner);
                    break;
                case 3:
                    calculateAverageGrade(students, scanner);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addStudent(ArrayList<Student> students, Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        Student student = new Student(name);
        students.add(student);
        System.out.println("Student added successfully.");
    }

    private static void addGrade(ArrayList<Student> students, Scanner scanner) {
        if (students.isEmpty()) {
            System.out.println("No students found. Add a student first.");
            return;
        }

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(studentName)) {
                System.out.print("Enter grade: ");
                double grade = scanner.nextDouble();
                student.addGrade(grade);
                System.out.println("Grade added successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void calculateAverageGrade(ArrayList<Student> students, Scanner scanner) {
        if (students.isEmpty()) {
            System.out.println("No students found. Add a student first.");
            return;
        }

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(studentName)) {
                double average = student.calculateAverageGrade();
                System.out.println("Average grade for " + student.getName() + ": " + average);
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
