package org.example;
import java.util.Comparator;

public class SalaryComporator implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b){
        return Integer.compare(a.getSalary(), b.getSalary());
    }

}
