package kata2;

import java.util.Date;

public class Student {

    private String name;
    private Date birthDate;
    public final static double DAY_PER_YEAR = 365.25;
    public final static long HOURS_PER_YEAR = (long) (24 * DAY_PER_YEAR);
    public final static long MINUTES_PER_YEAR = 60 * HOURS_PER_YEAR;
    public final static long SECONDS_PER_YEAR = 60 * MINUTES_PER_YEAR;
    public final static long MILLISECONDS_PER_YEAR = 1000 * SECONDS_PER_YEAR;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        Date today = new Date();
        long millinsecondsfrombirthdate = today.getTime() - birthDate.getTime();

        return (int) (millinsecondsfrombirthdate / MILLISECONDS_PER_YEAR);
    }
}
