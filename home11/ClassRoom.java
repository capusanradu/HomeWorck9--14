package HomeWorcks.LaZi.home11;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private List<StudentGrade> list;

    public ClassRoom(List<StudentGrade> list) {
        this.list = list;
    }

    public List<StudentGrade> getList() {
        return list;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> listGrades = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDiscipline().equals(discipline)) {
                listGrades.add(list.get(i).getGrade());
            }
        }
        return listGrades;
    }

    public List<Integer> getGradesForStuden(String student) {
        List<Integer> listStudentGrade = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(student)) {
                listStudentGrade.add(list.get(i).getGrade());
            }
        }
        return listStudentGrade;
    }

    // asa am inteles din cerinta sa returneze ce a mai mare nota de la disciplina respectiva
    public int getMaxGraded(String discipline) {
        int maxGrade = 0;
        for (int i = 0; i < getGradesForDiscipline(discipline).size(); i++) {
            if (getGradesForDiscipline(discipline).get(i) < maxGrade) {
                maxGrade = getGradesForDiscipline(discipline).get(i);
            }

        }
        return maxGrade;

    }

    // aici am facut nota ce a mai mare a unui elev dintre toti elevi
    public int getMaxGradeFromAllStudents() {
        int maxGrade = 0;
        List<Integer> studentGrades = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            studentGrades.add(list.get(i).getGrade());
        }
        for (int i = 0; i < studentGrades.size(); i++) {
            if (studentGrades.get(i) < maxGrade) {
                maxGrade = studentGrades.get(i);
            }
        }
        return maxGrade;
    }

    public Integer getAvreageGrade(String discipline) {
        Integer avreagegrade = 0;
        for (int i = 0; i < getGradesForDiscipline(discipline).size(); i++) {
            avreagegrade = getGradesForDiscipline(discipline).get(i) + getGradesForDiscipline(discipline).get(++i);
        }
        return avreagegrade / getGradesForDiscipline(discipline).size();
    }

    public int getWorsGrade(String discipline) {
        Integer worstGrade = Integer.MIN_VALUE;
        for (int i = 0; i < getGradesForDiscipline(discipline).size(); i++) {
            if (worstGrade > i) {
                worstGrade = i;
            }


        }
        return worstGrade;
    }
}


