// Student class with encapsulation
class Student {
    private String name;
    private int marks;   // private -> cannot be accessed directly

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    // Getter (students can only VIEW marks)
    public int getMarks() {
        return marks;
    }

    // Package-private method (only Teacher in same package can call)
    void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
}

// Teacher class
class Teacher {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    // Teacher updates student marks
    public void updateMarks(Student student, int marks) {
        student.setMarks(marks); // allowed because same package
        System.out.println("Teacher " + teacherName + " updated marks for " + student.getName());
    }
}

// Main class
public class StudentMarksSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Teacher t1 = new Teacher("Mr. Smith");

        // Students trying to view marks
        System.out.println(s1.getName() + "'s Marks: " + s1.getMarks());
        System.out.println(s2.getName() + "'s Marks: " + s2.getMarks());

        // Teacher updates marks
        t1.updateMarks(s1, 85);
        t1.updateMarks(s2, 92);

        // Students can now view updated marks
        System.out.println(s1.getName() + "'s Marks: " + s1.getMarks());
        System.out.println(s2.getName() + "'s Marks: " + s2.getMarks());
    }
}