package HomeWorcks.LaZi.home12.Ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfPersons {
    List<Person> listOfPersons = new ArrayList<>();

    public List<String> personsName() {
        List<String> listOfPersonsNames = new ArrayList<>();
        for(int i = 0; i < listOfPersons.size(); i++){
            listOfPersonsNames.add(listOfPersons.get(i).getName());
        }
        return listOfPersonsNames;

    }

    public Map<String, Integer> mapPersonNameToAge(){
        Map<String, Integer> personNameToAge = new HashMap<>();
        for(int i =0; i < listOfPersons.size(); i++){
            personNameToAge.put(listOfPersons.get(i).getName(), listOfPersons.get(i).getAge());
        }
        return personNameToAge;
    }

    public List<String> personsOlderThenGivenAge(int age){
        List<String> namesOfPersonsOlderThenGivingAge = new ArrayList<>();
        for(int i = 0; i < listOfPersons.size(); i++){
            if(listOfPersons.get(i).getAge() > age){
                namesOfPersonsOlderThenGivingAge.add(listOfPersons.get(i).getName());
            }
        }
        return namesOfPersonsOlderThenGivingAge;
    }

    public Map<String , String> mapPersonsHairColourToName(){
        Map<String, String> personHailColorToName = new HashMap<>();
        for (int i = 0; i < listOfPersons.size(); i++){
            personHailColorToName.put(listOfPersons.get(i).getHairColour() , listOfPersons.get(i).getName());
        }
        return personHailColorToName;
    }

    public Map<Integer, List<String>> mapAgeToListOfPeople(int age){
        Map<Integer, List<String>> ageToListOfPeople = new HashMap<>();
        List<String> namesOfPeoplesWithSameAge = new ArrayList<>();
        for(int i = 0; i < listOfPersons.size(); i++){
            if(listOfPersons.get(i).getAge() == age){
                namesOfPeoplesWithSameAge.add(listOfPersons.get(i).getName());
            }
        }
        ageToListOfPeople.put(age, namesOfPeoplesWithSameAge);
        return ageToListOfPeople;
    }
}

