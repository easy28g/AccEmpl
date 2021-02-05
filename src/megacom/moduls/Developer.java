package megacom.moduls;

import megacom.Service.DeveloperService;

public class Developer extends Employee implements DeveloperService {

    private Grades grades;

    public Developer() {

    }

    public Developer(Grades grades) {
        this.grades = grades;
    }

    public Developer(String name, int age, double salary, Grades grades) {
        super(name, age, salary);
        this.grades = grades;
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }

    public void printf(){
        System.out.println("Developer Class");
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Salary: "+getSalary());
        System.out.println("Grade: "+getGrades());
        writeCode();
    }

    @Override
    public void writeCode() {
        System.out.println("I am Develper");
    }
}
