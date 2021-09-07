import java.util.Scanner;

interface StackInterface {
    void push(int element);

    void display();

    int pop();
}

class StackClass implements StackInterface {
    int[] stk;
    int element, top;

    StackClass() {
        System.out.println("Enter stack size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.close();
        stk = new int[size];
        top = -1;
    }

    public void push(int element) {
        if (top >= stk.length - 1) {
            System.out.println("OverFlow");
        } else {
            stk[++top] = element;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("UnderFlow");
            return 0;
        } else {
            return (stk[top--]);
        }
    }

    public void display() {
        for (int element : stk) {
            System.out.println(element);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        StackClass a = new StackClass();
        Scanner scanner = new Scanner(System.in);
        int y;
        int x;
        x = scanner.nextInt();
        while (true) {
            System.out.println("\nEnter yours choice\n1.Push\n2.Pop\n3.Display\n4.Quit ");
            x = scanner.nextInt();
            switch (x) {
            case 1:
                y = scanner.nextInt();
                a.push(y);
            case 2:
                a.pop();
            case 3:
                a.display();
            case 4:
                scanner.close();
                System.exit(0);
            }
        }

    }
}