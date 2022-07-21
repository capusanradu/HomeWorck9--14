package HomeWorcks.LaZi.home11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ReturnAlistOfStudentGrades {


    public static StudentGrade fromLine(String line){
        String[] tokens = line.split(Pattern.quote("|"));
        return new StudentGrade(tokens[0], tokens[1],Integer.parseInt(tokens[2]));
    }

    public static void readFile() throws IOException {
        List<StudentGrade> list1 = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("file/grades.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            list1.add(fromLine(line));

        }
    }
}

