package managementSchool;

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, int id, String subject) {
        super(name, age, id);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher " + super.toString() + ", subject: " + subject;
    }
}
