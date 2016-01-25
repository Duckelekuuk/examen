package nl.Duckelekuuk.oefentoets;

import java.util.Date;

/**
 * @AUTHOR Duco.
 * Description
 */
public class Student extends Human {

    private String className;

    public Student(String name, Date dateOfBirth, String className) {
        super(name, dateOfBirth);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
