//6510451018 Harit Sombatsiri
package services;

import models.GumballMachine;

import java.util.Random;

public class HasQuarterState implements State{
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You can’t insert another quarter");
    }
    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    @Override
    public void turnCrank() {
        if(gumballMachine.getFlavor() == null) {
            System.out.println("You have  to choose the flavor first.");
        } else {
            System.out.println("You turned...");
            int winner = randomWinner.nextInt(10);
            if ((winner == 0) && (gumballMachine.getCount() > 1)) {
                gumballMachine.setState(gumballMachine.getWinnerState());
            } else {
                gumballMachine.setState(gumballMachine.getSoldState());
            }
        }
    }
    @Override
    public void dispense() {
        System.out.println("No gumball dispensed.\n");
    }
}
