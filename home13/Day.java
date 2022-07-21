package HomeWorcks.LaZi.home13;

public enum Day {
    MONDAY(1),
    TUESDAY(2),
    WENSDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int day;

    int getDay() {
        return this.day;
    }

    Day(int day) {
        this.day = day;
    }

}
