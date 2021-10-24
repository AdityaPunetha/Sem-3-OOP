import java.util.Scanner;

class exp8_1 {
    public static void main(String[] args) {
        int len1, len2, last = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string:");
        String s1 = sc.next();
        System.out.println();
        System.out.print("Enter sub string:");
        String s2 = sc.next();
        System.out.println();
        sc.close();
        len1 = s1.length();
        len2 = s2.length();
        for (int i = 0; i <= (len1 - len2); i++) {
            if (s1.substring(i, len2 + i).equals(s2)) {
                if (last == 0)
                    System.out.println("First occurance of substring :" + (i + 1));
                last = i + 1;
            }
        }
        if (last != 0)
            System.out.println("Last occurance of substring :" + last);
        else
            System.out.println("Substring is not found");
    }
}
