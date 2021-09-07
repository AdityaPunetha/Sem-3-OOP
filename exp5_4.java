import java.util.Scanner;

interface test1 {
    int division(int a, int b);

    int muliply(int a, int b);
}

class X implements test1 {
    public int division(int a, int b) {
        return a / b;
    }

    public int muliply(int a, int b) {
        return a * b;
    }
}

class Y {
    public int division(int a, int b) {
        return a * b;
    }

    public int muliply(int a, int b) {
        return a / b;
    }
}

class override {
    public static void main(String args[]) {
        System.out.print("Enter two number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        X obj = new X();
        Y obj1 = new Y();
        System.out.println(obj.division(a, b));
        System.out.println(obj1.division(a, b));
        System.out.println(obj.muliply(a, b));
        System.out.println(obj1.muliply(a, b));
    }
}