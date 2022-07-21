package HomeWorcks.LaZi.home13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DallyPlanner {


    List<DaySchedule> dayScheduleList = new ArrayList<>();

    public void addActivity(Enum day, String activities) {
        if (activities == null) {
            throw new NoActivityException("We can`t add null activities to the Schedule");
        }
        // dayScheduleList.add((day = ), activities);
    }

    public void removeActivity(Enum day, String activitie) {
        if (!dayScheduleList.remove(activitie)) {
            throw new NoActivityException("No such activity in the Schedule");
        }
        //  dayScheduleList.remove(day, activitie);

    }

    public List<String> getActivities(Enum day) {
        List<String> activitiesForTheDay = new ArrayList<>();
        //  activitiesForTheDay.add(dayScheduleList());
        return activitiesForTheDay;
    }

    public Map<Day, List<String>> endPlanning() throws NoActivitiesForDayException {
        Map<Day, List<String>> fullSchedule = new HashMap<>();
        fullSchedule.put(Day.MONDAY, getActivities(Day.MONDAY));
        fullSchedule.put(Day.TUESDAY, getActivities(Day.TUESDAY));
        fullSchedule.put(Day.WENSDAY, getActivities(Day.WENSDAY));
        fullSchedule.put(Day.THURSDAY, getActivities(Day.THURSDAY));
        fullSchedule.put(Day.FRIDAY, getActivities(Day.FRIDAY));
        fullSchedule.put(Day.SATURDAY, getActivities(Day.SATURDAY));
        fullSchedule.put(Day.SUNDAY, getActivities(Day.SUNDAY));

        if(fullSchedule.containsValue(null)){
            throw new NoActivitiesForDayException("No activities for that day");
        }




        for (Day key : fullSchedule.keySet()) {   // nu stiu daca am facut bine
            if (fullSchedule.containsValue(null)) {
                throw new NoActivitiesForDayException("No activities for that day");
            }
        }


        return fullSchedule;


    }
}












