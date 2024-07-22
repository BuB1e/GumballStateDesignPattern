//6510451018 Harit Sombatsiri
package services;

import models.GumballMachine;

public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("The machine is sold out.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter yet.");
    }

    @Override
    public void turnCrank() {
        System.out.println("There are no gumballs.");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed.");
    }
}
