//6510451018 Harit Sombatsiri
import models.GumballMachine;

public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.choose("Mango");

        gumballMachine.insertQuarter();
        gumballMachine.choose("Orange");
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.choose("Mango");
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.choose("Orange");
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.choose("Mango");
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.choose("Orange");
        gumballMachine.turnCrank();

        gumballMachine.refill(10);

        gumballMachine.insertQuarter();
        gumballMachine.choose("Mango");
        gumballMachine.turnCrank();

    }
}