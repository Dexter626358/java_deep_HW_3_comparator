package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Sergeu", "Nicolaecnx", "Gusev", "employee", "89038105501",
                100, 1964);
        Employee employee2 = new Employee("Sergeu", "Nicolaecnx", "Gusev", "employee", "89038105501",
                200, 1974);
        Employee employee3 = new Employee("Sergeu", "Nicolaecnx", "Gusev", "head", "89038105501",
                300, 1984);
        Employee employee4 = new Employee("Sergeu", "Nicolaecnx", "Gusev", "employee", "89038105501",
                400, 1994);
        Employee employee5 = new Employee("Sergeu", "Nicolaecnx", "Gusev", "head", "89038105501",
                500, 2004);
        List<Employee> company = new ArrayList<>();
        company.add(employee1);
        company.add(employee2);
        company.add(employee3);
        company.add(employee4);
        company.add(employee5);

        for (Employee emp: company){
            emp.getInfo();
        }
        company.sort(new AgeComporator());
        System.out.println("AgeComporator");
        for (Employee emp: company){
            emp.getInfo();
        }
        company.sort(new SalaryComporator());
        System.out.println("SalaryComporator");


        for (Employee emp: company){
            emp.getInfo();
        }

        Boss.salaryUp(company, 45, 5000);
        for (Employee emp: company){
            emp.getInfo();
        }
    }

//    public static void salaryUp(Employee[] array){
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].getAge() > 45){
//                array[i].setSalary(array[i].getSalary() + 5000);
//            }
//        }
//    }


}