package nl.Duckelekuuk.oefentoets;

import java.util.Date;

/**
 * @AUTHOR Duco.
 * Description
 */
public class Teacher extends Human {

    private boolean slb;

    public Teacher(String name, Date dateOfBirth, boolean slb) {
        super(name, dateOfBirth);
        this.slb = slb;
    }

    public Teacher(String name, Date dateOfBirth) {
        super(name, dateOfBirth);
        this.slb = false;
    }

    public boolean isSlb() {
        return slb;
    }

    public void setSlb(boolean slb) {
        this.slb = slb;
    }

    public boolean reportSick(Human human) throws NoStudentException {

        if (!(Student.class.isAssignableFrom(human.getClass()))) {
            throw new NoStudentException("Teacher " + getName() + " , you can only report students as sick");
        }

        if (human.isZiek()) {
            System.out.println(getName() + ": " + human.getName() + " is already reported as sick");
            return false;
        }
        human.setZiek(true);
        System.out.println(getName() + ": " + human.getName() + " has reported sick");
        return true;
    }
}
