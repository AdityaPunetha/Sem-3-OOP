import java.util.Scanner;

interface A {
    int meth1(int n, int p);

    int meth2(int n, int p);
}

class MyClass implements A {
    public int meth1(int n, int p) {
        return n + p;
    }

    public int meth2(int n, int p) {
        return n - p;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter another number: ");
        int p = sc.nextInt();
        sc.close();
        MyClass obj = new MyClass();
        System.out.println(obj.meth1(n, p));
        System.out.println(obj.meth2(n, p));
    }
}