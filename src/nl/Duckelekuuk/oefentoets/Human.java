package nl.Duckelekuuk.oefentoets;

import java.util.Calendar;
import java.util.Date;

/**
 * @AUTHOR Duco.
 * Description
 */
public class Human {

    private String name;
    private Date dateOfBirth;
    private boolean sick;

    public Human(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sick = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isSick() {
        return sick;
    }

    public void setSick(boolean ziek) {
        this.sick = ziek;
    }

    public int age() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfBirth);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - calendar.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < calendar.get(Calendar.DAY_OF_YEAR))
            age=-1;
        return age;
    }

    public String toString() {
        return name + ", " + age();
    }
}
