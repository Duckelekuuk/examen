package nl.Duckelekuuk.oefentoets;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @AUTHOR Duco.
 * Description
 */
public class main {

    public static void main(String args[]) {
        Teacher teacher_1 = new Teacher("Marcel", parseDate("1984-04-13"));
        Student mezelf = new Student("Duco", parseDate("1999-05-21"),"AMO1A");
        Teacher teacher_2 = new Teacher("Rody", parseDate("1998-07-31"));

        try {
            teacher_1.reportSick(mezelf);
            teacher_2.reportSick(mezelf);

            teacher_1.reportSick(teacher_2);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Date parseDate(String date) {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date thisDate = null;
        try {
            thisDate = formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return thisDate;
    }
}
