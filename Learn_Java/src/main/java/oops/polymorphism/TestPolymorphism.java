package oops.polymorphism;

public class TestPolymorphism extends Car {

    public static void main(String[] args) {
        Bike bikeObject = new Bike();
        bikeObject.break1();
        bikeObject.break1("both");
    }
}
