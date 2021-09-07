import java.util.Scanner;

interface test {
    int square(int n);
}

class arithmetic implements test {
    public int square(int n) {
        return n * n;
    }
}

class ToTestInt {
    public static void main(String args[]) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        arithmetic x = new arithmetic();
        System.out.println(x.square(n));
    }
}