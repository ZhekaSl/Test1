package Interface;

import Interface.Worker;

public class Driver extends Worker implements CanDrive{
    public Driver(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("Я вожу людей!");
    }
}
