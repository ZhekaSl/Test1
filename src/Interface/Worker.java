package Interface;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voice() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Petya");
        Programmer programmer2 = new Programmer("Sasha");
        Programmer programmer3 = new Programmer("Maria");

        Cooker cooker1 = new Cooker("Petro");
        Cooker cooker2 = new Cooker("Alex");
        Cooker cooker3 = new Cooker("Pedro");

        Driver driver1 = new Driver("Masha");
        Driver driver2 = new Driver("Oleg");
        Driver driver3 = new Driver("Karina");

        ArrayList<Worker> people = new ArrayList<>();
        people.add(programmer1);
        people.add(programmer2);
        people.add(programmer3);
        people.add(cooker1);
        people.add(driver1);
        people.add(cooker2);
        people.add(driver2);
        people.add(cooker3);
        people.add(driver3);

        for (Worker i : people) {
            i.voice();
        }
        ArrayList<CanCook> cookers = new ArrayList<>();
        cookers.add(cooker1);
        cookers.add(cooker2);
        cookers.add(cooker3);
        ArrayList<CanProgram> programmers = new ArrayList<>();
        programmers.add(programmer1);
        programmers.add(programmer2);
        programmers.add(programmer3);
        ArrayList<CanDrive> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        for (CanCook i : cookers) {
            i.cook();
        }
        for (CanDrive i : drivers ) {
            i.drive();
        }
        for (CanProgram i : programmers) {
            i.program();
        }
    }
}
