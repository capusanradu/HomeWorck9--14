package HomeWorcks.LaZi.home10.Home1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Basket {

    List<String> basketThatHoldFruits = new ArrayList<>();

    public boolean find(String fruit) {
        boolean find = true;
        for (String s : basketThatHoldFruits) {
            if (s.contains(fruit)) {
                find = true;
            } else {
                find = false;
            }
        }
        return find;
    }

    public boolean remove(String removestring) {
        boolean find = true;
        for (String s : basketThatHoldFruits) {
            if (s.contains(removestring)) {
                boolean removeString = basketThatHoldFruits.remove(removestring);
                find = true;
            } else {
                find = false;
            }
        }
        return find;
    }

    public int position(String fruit){
        int position = 0;
        for(String s : basketThatHoldFruits){
            if(s.contains(fruit)){
                position = basketThatHoldFruits.indexOf(s);
            } else {
                position = 0;
            }
        }return position;
    }

    public Collection distinct(){
        Collection<String> newCollection = basketThatHoldFruits;
        return newCollection;

    }

    public void addFruitToBasket(String fruit){
        basketThatHoldFruits.add(fruit);
    }

    public int count(){
        return basketThatHoldFruits.size();
    }

    public int customCount(){
        int count = 0;
        for(int i = 0; i < basketThatHoldFruits.size(); i++){
            count += 1;
        } return count;
    }
}

