package lesson27;

public class Student extends Person {
    private int studentID;

    public Student(String name, int studentID) {
        super(name);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public void display() {
        System.out.println("Имя - " + getName() + " ID - " + getStudentID());;

    }
}
