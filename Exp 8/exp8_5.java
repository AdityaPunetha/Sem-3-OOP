public class exp8_5 {
    public static void main(String[] args) {
        int a = 100;
        System.out.println("int: " + a);
        Integer myInteger = new Integer(a);
        System.out.println("int to Integer: " + myInteger);
        String myString = Integer.toString(myInteger);
        System.out.println("Integer to String: " + myString);
        int myInt = Integer.parseInt(myString);
        System.out.println("String to int: " + myInt);
        myString = Integer.toString(myInt);
        System.out.println("int to String: " + myString);
        myInteger = new Integer(myString);
        System.out.println("String to Integer: " + myInteger);
        myInt = myInteger.intValue();
        System.out.println("Integer to int: " + myInteger);
    }
}
