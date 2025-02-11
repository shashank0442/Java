package StringPrograms;

public class DemoStringBuffer {
    public static void main(String[] args) {
        StringBuffer sbObject = new StringBuffer("Shashank");
        System.out.println("Capacity = " + sbObject.capacity());
        System.out.println("length = " + sbObject.length());
        sbObject.append(" Kelkar");
        System.out.println(sbObject);
        sbObject.deleteCharAt(0);

        System.out.println(sbObject);



    }
}
