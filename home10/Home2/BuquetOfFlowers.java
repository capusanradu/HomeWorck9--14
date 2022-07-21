package HomeWorcks.LaZi.home10.Home2;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class BuquetOfFlowers {
    private String flower;
    List<String> buquetOfFlowers1 = new ArrayList<>();


    public String getFlower() {
        byte[] array = new byte[7];
        new Random().nextBytes(array);
        String flower = new String(array, Charset.forName("UTF-8"));
        return this.flower;
    }

    public void add() {
        buquetOfFlowers1.add(getFlower());
    }

    public void remove() {
        for (String s : buquetOfFlowers1) {
            if (s.contains(getFlower())) {
                buquetOfFlowers1.remove(getFlower());
            }
        }
    }

    public Collection getAll(){
        Collection<String> allFlowers = buquetOfFlowers1;
        return allFlowers;
    }
}
