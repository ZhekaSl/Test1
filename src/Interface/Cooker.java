package Interface;

import Interface.Worker;

public class Cooker extends Worker implements CanCook {
    public Cooker(String name) {
        super(name);
    }
    @Override
    public void cook() {
        System.out.println("Я готовлю кушать!");
    }
}
