package conecpt.superconstructor;

public class Student extends Person{

    private String schoolName;

    Student(String name, String schoolName) {
        super(name);
        this.schoolName = schoolName;
    }
}
