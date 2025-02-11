package oops.inheritance;

public class ChildClass extends ParentClass {


    public static void main(String[] args) {
        ParentClass pObj = new ChildClass();
        pObj.talk();
        pObj.walk();
        pObj.wish();
        //pObj.laugh(); // this is private method can't be used outside of the class

        // Here we can not inherit private member function

    }

}
