package HomeWorcks.LaZi.home14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReadQuote {


    public static void readOneLine() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("file", "quotes.txt"));
        String line= scanner.nextLine();
    }


    public static Quote fromLine(String line){
        String[] tokens = line.split(Pattern.quote("~"));
        return new Quote(0,tokens[0],tokens[1] );
    }

    public static void readFullFilee() throws FileNotFoundException {
        Scanner scanner = new Scanner (new File("file","quotes.txt"));
        while (scanner.hasNext()){
            scanner.nextLine();
        }
    }





}
