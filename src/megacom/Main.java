package megacom;

import java.util.Scanner;
import java.util.Random;

import megacom.moduls.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Specialist[] specialist = new Specialist[3];
        for(int i=0; i<specialist.length; i++){
            specialist[i] = new Specialist("spName-"+(i+1), (int)(Math.random()*(50-18))+18,
                    (int)(Math.random()*(100000-40000))+40000 , (int)(Math.random()*(4-0))+0);
        }

        for(int i=0; i<specialist.length; i++){
            System.out.println("Specialist #"+(i+1));
            specialist[i].printf();
            System.out.println("*********************************");
        }



        Developer[] developer = new Developer[4];
        for(int i=0; i< developer.length; i++){

            Grades[] grades = Grades.values();

            developer[i] = new Developer("devName-"+(i+1), (int)(Math.random()*(50-18))+18,
                    (int)(Math.random()*(100000-40000))+40000, grades[(int) (Math.random() * (5 - 0)) - 0]);
        }

        for(int i=0; i<developer.length; i++){
            System.out.println("Develper #"+(i+1));
            developer[i].printf();
            System.out.println("*********************************");
        }


        Random random = new Random();
        boolean chance50oftrue = (random.nextInt(2) == 0) ? true : false;


        Manager[] manager = new Manager[2];
        for(int i=0; i< manager.length; i++){
            manager[i] = new Manager("managerName-"+(i+1), (int)(Math.random()*(50-18))+18,
                    (int)(Math.random()*(100000-40000))+40000, chance50oftrue);
        }

        for(int i=0; i< manager.length; i++){
            System.out.println("Manager #"+(i+1));
            manager[i].printf();
            System.out.println("*********************************");
        }


        Ceo ceo = new Ceo("CEO", (int)(Math.random()*(50-22))+22,
                    (int)(Math.random()*(100000-40000))+40000,
                    chance50oftrue, chance50oftrue );
        ceo.printf();

        //-------------------РУЧНОЙ ВВОД------------------
        /*
        //IN PUT SPECIALIST
        Specialist[] specialist1 = new Specialist[3];

        for(int i=0; i<specialist1.length; i++){
            System.out.println("Specialist #"+(i+1));

            System.out.print("Name: ");
            String name = scan.next();

            System.out.print("Age: ");
            int age = scan.nextInt();

            System.out.print("Salary: ");
            double salary = scan.nextDouble();

            System.out.print("Levels: ");
            int levels = scan.nextInt();

            specialist1[i] = new Specialist(name, age, salary, levels);
        }

        // OUT PUT INFO ABOUT SPECIALIST
        for(int i=0; i<specialist1.length; i++){
            specialist1[i].printf();
        }

        Developer[] developer = new Developer[4];

        for(int i=0; i<developer.length; i++){
            System.out.println("Developer #"+(i+1));

            System.out.print("Name: ");
            String name = scan.next();

            System.out.print("Age: ");
            int age = scan.nextInt();

            System.out.print("Salary: ");
            double salary = scan.nextDouble();

            System.out.print("Grades: ");
            String grades = scan.next();

            developer[i] = new Developer(name, age, salary, grades);
        }

        // OUT PUT INFO ABOUT DEVELOPER
        for(int i=0; i<developer.length; i++){
            developer[i].printf();
        }

        //IN PUT MANAGER
        Manager[] manager = new Manager[2];

        for(int i=0; i<manager.length; i++){
            System.out.println("Manager #"+(i+1));

            System.out.print("Name: ");
            String name = scan.next();

            System.out.print("Age: ");
            int age = scan.nextInt();

            System.out.print("Salary: ");
            double salary = scan.nextDouble();

            System.out.print("Has Stocks: ");
            boolean hasStocks = scan.hasNextBoolean();

            manager[i] = new Manager(name, age, salary, hasStocks);
        }

        // OUT PUT INFO ABOUT MANAGER
        for(int i=0; i<manager.length; i++){
            manager[i].printf();
        }

        Ceo ceo = new Ceo("CEO", 30, 100000, true, true );
        ceo.printf();
*/

    }
}
