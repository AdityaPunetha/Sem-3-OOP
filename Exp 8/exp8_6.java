public class exp8_6 {
    public static void main(String[] args) {
        float a = 100;
        System.out.println("float: " + a);
        Float myFloat = new Float(a);
        System.out.println("float to Float: " + myFloat);
        String myString = Float.toString(myFloat);
        System.out.println("Float to String: " + myString);
        float myfloat = Float.parseFloat(myString);
        System.out.println("String to float: " + myfloat);
        myString = Float.toString(myfloat);
        System.out.println("float to String: " + myString);
        myFloat = new Float(myString);
        System.out.println("String to Float: " + myFloat);
        myfloat = myFloat.floatValue();
        System.out.println("Float to float: " + myfloat);
    }
}