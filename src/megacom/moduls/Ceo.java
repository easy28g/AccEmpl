package megacom.moduls;

import megacom.Service.CEOservice;

public class Ceo extends Manager implements CEOservice {

    private boolean hasCompanyCar;

    public Ceo(String name, int age, double salary, boolean hasStocks, boolean hasCompanyCar) {
        super(name, age, salary, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    public void printf(){
        System.out.println("Employee Class");
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Salary"+getSalary());
        System.out.println("Has Stocks: "+isHasStocks());
        System.out.println("Has Company Car: "+isHasCompanyCar());
        goPublic();
    }

    @Override
    public void goPublic() {
        System.out.println("I am CEO");
    }
}
