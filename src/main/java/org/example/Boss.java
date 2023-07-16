package org.example;

import java.util.List;

public class Boss extends Employee{
    public Boss(String name, String midname, String surname, String possition, String phone, int salary, int birth) {
        super(name, midname, surname, possition, phone, salary, birth);
    }

    public static void salaryUp(List<Employee> array, int age, int increase){
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getAge() > age && !array.get(i).getPossition().equals("head")){
                array.get(i).setSalary(array.get(i).getSalary() + increase);
            }
        }
    }
}
