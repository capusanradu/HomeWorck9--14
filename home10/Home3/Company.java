package HomeWorcks.LaZi.home10.Home3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Person> companyEmploymentList = new ArrayList<>();

    public Person getManager(Person person) {

        for (int i = 0; i < companyEmploymentList.size(); i++) {
            if (person.getPosition() == "manager") {
                return person;
            }
        }

        return person;
    }

    public List getPersons(String position) {
        List<Person> profesionList = new ArrayList<>();
        for (int i = 0; i < companyEmploymentList.size(); i++) {
            if (companyEmploymentList.get(i).getPosition().equals(position)) {
                profesionList.add(companyEmploymentList.get(i));
            }
        }
        return profesionList;
    }

    public List getPersonsOlder(int age) {
        List<Person> personsOlder = new ArrayList<>();
        for (int i = 0; i < companyEmploymentList.size(); i++) {
            if (companyEmploymentList.get(i).getAge() == age) {
                personsOlder.add(companyEmploymentList.get(i));
            }
        }
        return personsOlder;
    }

    public List getPerson(String filtername) {
        List<Person> personNameList = new ArrayList<>();
        for (int i = 0; i < companyEmploymentList.size(); i++) {
            if (companyEmploymentList.get(i).getName().equals(filtername)) {
                personNameList.add(companyEmploymentList.get(i));
            }
        }
        return personNameList;

    }

    public List employ(Person newEmployer) {
        if (newEmployer.getPosition().equals("manager")) {
            System.out.println("We all ready have a manager");
        } else {
            companyEmploymentList.add(newEmployer);
        }
        return companyEmploymentList;
    }
}