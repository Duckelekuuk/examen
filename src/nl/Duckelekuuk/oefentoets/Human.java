package nl.Duckelekuuk.oefentoets;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/**
 * @AUTHOR Duco.
 * Description
 */
public class Human {

    private String name;
    private Date dateOfBirth;
    private boolean ziek;

    public Human(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.ziek = false;
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

    public boolean isZiek() {
        return ziek;
    }

    public void setZiek(boolean ziek) {
        this.ziek = ziek;
    }

    public int leeftijd() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfBirth);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - calendar.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < calendar.get(Calendar.DAY_OF_YEAR))
            age=-1;
        return age;
    }

    public String toString() {
        return name + ", " + leeftijd();
    }
}
