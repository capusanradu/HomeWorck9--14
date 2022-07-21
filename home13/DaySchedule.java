package HomeWorcks.LaZi.home13;

public class DaySchedule {

    private Enum<Day> day;
    private String activities;

    public Enum<Day> getDay() {
        return day;
    }

    public String getActivities() {
        return activities;
    }

    public DaySchedule(Enum<Day> day, String activities) {
        this.day = day;
        this.activities = activities;
    }


}
