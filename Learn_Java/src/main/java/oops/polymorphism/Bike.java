package oops.polymorphism;

public class Bike {

    public void break1() {
        System.out.println("Bike stopped break applied");
    }

    public void break1(String isBothBreakToBePressed) {
        System.out.println("Bike stopped with both" + isBothBreakToBePressed + " breaks applied ");
    }

}
