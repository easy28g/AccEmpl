package megacom.moduls;

import megacom.Service.SpecialistService;

public class Specialist extends Employee implements SpecialistService {

    private int levels;

    public Specialist() {
    }

    public Specialist(String name, int age, double salary, int levels) {
        super(name, age, salary);
        this.levels = levels;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public void printf(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Salary: "+getSalary());
        System.out.println("Level: "+getLevels());
        workWithClients();
    }

    @Override
    public void workWithClients() {
        System.out.println("I am Specialist");
    }
}
