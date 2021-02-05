package megacom.moduls;

import megacom.Service.ManagerService;


public class Manager extends Employee implements ManagerService{

    private boolean hasStocks;

    public Manager() {
    }

    public Manager(String name, int age, double salary, boolean hasStocks) {
        super(name, age, salary);
        this.hasStocks = hasStocks;
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public void printf(){
        System.out.println("Employee Class");
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Salary: "+getSalary());
        System.out.println("Has Stocks: "+isHasStocks());
        writeProcedures();
    }

    @Override
    public void writeProcedures() {
        System.out.println("I am Manager");
    }


}
