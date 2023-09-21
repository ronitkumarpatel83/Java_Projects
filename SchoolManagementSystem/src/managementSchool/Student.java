package managementSchool;

class Student extends Person {
    private int grade;

    public Student(String name, int age, int id, int grade) {
        super(name, age, id);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student " + super.toString() + ", grade: " + grade;
    }
}
