package megacom.moduls;

import java.sql.SQLOutput;

public abstract class Employee {

    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void print(){
        System.out.println("Employee Class");
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Salary"+getSalary());
    }


}
