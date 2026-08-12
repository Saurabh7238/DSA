import java.util.Scanner;

public class pattern {
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " "); // print on same line
            }
            System.out.println(); // move to next line
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();


        pattern1(n);
    }
}
