package managementSchool;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();

        // Creating students
        Student student1 = new Student("Ronit Patel", 15, 1001, 9);
        Student student2 = new Student("Ritu Patel", 14, 1002, 8);

        // Adding students to the list
        students.add(student1);
        students.add(student2);

        // Creating teachers
        Teacher teacher1 = new Teacher("Mr. Ashok", 35, 2001, "Math");
        Teacher teacher2 = new Teacher("Ms. Sabitri", 40, 2002, "Science");

        // Adding teachers to the list
        teachers.add(teacher1);
        teachers.add(teacher2);

        // Creating funds
        Funds funds = new Funds(10000.0);

        // Adding income and deducting expenses
        funds.addIncome(5000.0);
        funds.deductExpenses(2000.0);

        // Displaying remaining funds
        System.out.println(funds);

        // Displaying students
        for (Student student : students) {
            System.out.println(student);
        }

        // Displaying teachers
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
