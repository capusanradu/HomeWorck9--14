package HomeWorcks.LaZi.home12.Ex3;

import HomeWorcks.LaZi.home12.Ex2.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee extends Person {
    private String company;
    private int salary;

    public Employee(String name, int age, String hairColour, String company, int salary) {
        super(name, age, hairColour);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    List<Employee> listOfEmployee = new ArrayList<>();

    public List<String> personesWithSalaryeHighert(int sum) {
        List<String> personesWithHigherSalarie = new ArrayList<>();
        for (int i = 0; i < listOfEmployee.size(); i++) {
            if (listOfEmployee.get(i).getSalary() > sum) {
                personesWithHigherSalarie.add(listOfEmployee.get(i).getName());
            }

        }
        return personesWithHigherSalarie;
    }

    public Map<Integer, List<Employee>> intNumberOfCompanyToEmployees(int numberIDOfComapny) {
        List<Employee> listOfEmployeeForComapany = new ArrayList<>();
        Map<Integer, List<Employee>> idOfCompanyToEmployees = new HashMap<>();
        idOfCompanyToEmployees.put(numberIDOfComapny, listOfEmployeeForComapany);
        return idOfCompanyToEmployees;
    }

    public int sumOfAllSalariesOfAllEmployees(List<Employee> listOfEmployee) {
        int sumOfAllSalaries = 0;
        List<Integer> numbersOfSalaries = new ArrayList<>();
        for (int i = 0; i < listOfEmployee.size(); i++) {
            numbersOfSalaries.add(listOfEmployee.get(i).getSalary());
        }
        for (int i = 0; i < numbersOfSalaries.size(); i++) {
            sumOfAllSalaries = numbersOfSalaries.get(i) + numbersOfSalaries.get(++i);
        }
        return sumOfAllSalaries;
    }

    public int calculateWhicCompanyGivesTheBigestSalarie(List<Employee> company1, List<Employee> company2) {
        int companyBiggestSalarie1 = 0;
        int companyBiggestSalarie2 = 0;
        int bigestSalarie = 0;
        for (int i = 0; i < company1.size(); i++) {
            if (company1.get(i).getSalary() > company1.get(++i).getSalary()) {
                companyBiggestSalarie1 = company1.get(i).getSalary();
            } else if (company1.get(i).getSalary() < company1.get(++i).getSalary()) {
                companyBiggestSalarie1 = company1.get(++i).getSalary();

            }
        }

        for (int i = 0; i < company2.size(); i++) {
            if (company2.get(i).getSalary() > company2.get(++i).getSalary()) {
                companyBiggestSalarie2 = company2.get(i).getSalary();
            } else if (company2.get(i).getSalary() < company2.get(++i).getSalary()) {
                companyBiggestSalarie1 = company2.get(++i).getSalary();

            }
        }

        if (companyBiggestSalarie1 > companyBiggestSalarie2) {
            bigestSalarie = companyBiggestSalarie1;
        } else if (companyBiggestSalarie2 > companyBiggestSalarie1) {
            bigestSalarie = companyBiggestSalarie2;

        }
        return bigestSalarie;


    }

}
