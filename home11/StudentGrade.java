package HomeWorcks.LaZi.home11;

public class StudentGrade {
private String nameAndSurname;
private String discipline;
private int grade;

    public String getName() {
        return nameAndSurname;
    }

    public String getDiscipline() {
        return discipline;
    }

    public int getGrade() {
        return grade;
    }

    public StudentGrade(String name, String discipline, int grade) {
        this.nameAndSurname = name;
        this.discipline = discipline;
        this.grade = grade;
    }
}
