package extraprograms;

public class Encapsulation_Example {
    // How to implement setters for implementing encapsulation
    private String empid, name;

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public void setName(String name) {
        this.name = name;
    }

    // How to implement getters for implementing encapsulation

    public String getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Encapsulation_Example obj = new Encapsulation_Example();
        obj.setEmpid("12sk89");
        obj.setName("Shashank Kelkar");
        System.out.println("Employee ID is " + obj.getEmpid());
        System.out.println("Employee Name is " + obj.getName());
    }
}
