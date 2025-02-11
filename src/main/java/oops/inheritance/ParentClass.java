package oops.inheritance;

public class ParentClass {

    private void laugh() {
        System.out.println("Private: The most restrictive access level. " +
                "Members declared as private are only accessible within the same class.");
    }

    void talk() {
        System.out.println("default (no modifier): When no access modifier is specified, " +
                "it is considered default access. " +
                "Members with default access are accessible within the same package, " +
                "but not from outside the package.");
    }

    protected void walk() {
        System.out.println("protected: Members declared as protected are accessible within " +
                "the same package and by subclasses, even if the subclasses are in a different package.");
    }

    public void wish() {
        System.out.println("public: The least restrictive access level. " +
                "Members declared as public are accessible from any other class, regardless of the package.");
    }


}
