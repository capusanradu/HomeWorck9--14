package HomeWorcks.LaZi.home12.Ex1;

import java.util.HashMap;
import java.util.Map;

public class MapWithKey {
    Map<String, Integer> studentToGrade = new HashMap<>();

    public static void main(String[] args) {

    }

    public void printAllStudentsandTheirGrades() {
        // aici ai vrut sa fac cu un for
        System.out.println(studentToGrade);
    }

    public void findTheStudentWithTheHigherGrade() {
        String studentWithHigerGrade;
        if (studentToGrade.isEmpty()) {
            System.out.println("Please add Student + Grade");
        } else if (studentToGrade.containsValue(10)) {


        }
    }
}