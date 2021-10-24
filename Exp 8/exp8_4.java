import java.util.Scanner;

class myname {
    String name;

    myname(String n) {
        name = n;
    }

    void display() {
        int count = 0;
        System.out.println("Your name: " + name);
        System.out.println("Length of name: " + name.length());
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a') {
                count++;
                System.out.println("Position of 'a': " + i);
            }
        }
        System.out.println("Total occurrences: " + count);
    }
}

class exp8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        myname a = new myname(sc.nextLine());
        a.display();
        sc.close();
    }
}
