
import java.util.Scanner;

class exp8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        StringBuffer s = new StringBuffer(sc.nextLine());
        sc.close();
        System.out.println("Original string: " + s);
        for (int i = 0; i < s.length(); i++)
            s.setCharAt(i, (char) (s.charAt(i) - 32));
        System.out.println("Modified String: " + s);
    }
}
