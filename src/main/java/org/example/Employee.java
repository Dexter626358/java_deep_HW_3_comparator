package org.example;

public class Employee {
    private final int CURRENT_YEAR = 2023;
    private String name;
    private String midname;
    private String surname;
    private String possition;
    private String phone;
    private int salary;
    private int birth;

    public Employee(String name, String midname, String surname, String possition, String phone, int salary, int birth) {
        this.name = name;
        this.midname = midname;
        this.surname = surname;
        this.possition = possition;
        this.phone = phone;
        this.salary = salary;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public String getMidname() {
        return midname;
    }

    public String getSurname() {
        return surname;
    }

    public String getPossition() {
        return possition;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return CURRENT_YEAR - birth;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    public void getInfo(){
        System.out.println("Employee = {name = " +  name + ","
                + "midname = " + midname + ", "
                + "surname = " + surname + ", "
                + "position = " + " " + possition + ", "
                + "phone = " + phone + ", "
                + "salary = " + salary + ", "
                + "age = " + getAge() + "}");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "CURRENT_YEAR=" + CURRENT_YEAR +
                ", name='" + name + '\'' +
                ", midname='" + midname + '\'' +
                ", surname='" + surname + '\'' +
                ", possition='" + possition + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", birth=" + birth +
                '}';
    }
}
