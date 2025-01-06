package oops.inheritance;

public class ChildClass extends ParentClass {


    public static void main(String[] args) {
        ParentClass pObj = new ChildClass();
        pObj.talk();
        pObj.walk();
        pObj.wish();

        // Here we can not inherit private member function

    }

}
