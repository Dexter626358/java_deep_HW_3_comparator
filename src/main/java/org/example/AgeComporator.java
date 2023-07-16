package org.example;
import java.util.Comparator;

public class AgeComporator implements Comparator<Employee>{

    @Override
    public int compare(Employee a, Employee b){
        return Integer.compare(a.getAge(), b.getAge());
    }

}
