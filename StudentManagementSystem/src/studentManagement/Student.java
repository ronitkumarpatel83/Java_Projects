package studentManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class Student {
    private String name;
    private String studentId;
    private List<String> enrolledCourses;
    private int balance;

    public Student(String name) {
        this.name = name;
        this.studentId = generateStudentId();
        this.enrolledCourses = new ArrayList<>();
        this.balance = 0;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public List<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public int getBalance() {
        return balance;
    }

    public void enrollCourse(String course) {
        enrolledCourses.add(course);
        System.out.println("Enrolled in course: " + course);
    }

    public void viewBalance() {
        System.out.println("Balance: $" + balance);
    }

    public void payTuitionFees(int amount) {
        balance -= amount;
        System.out.println("Paid tuition fees: $" + amount);
        viewBalance();
    }

    public void showStatus() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Enrolled Courses: " + enrolledCourses);
        viewBalance();
    }

    private String generateStudentId() {
        Random random = new Random();
        StringBuilder studentId = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            studentId.append(random.nextInt(10));
        }
        return studentId.toString();
    }
}
