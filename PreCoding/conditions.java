package PreCoding;

import java.util.Scanner;

//you are given as an input marsks of a student
//display anappropriate message  based on following rules
//for marks above 90 print excellent
// for 80 or less tham equal to 90 print good
// 70 or less than eqaul to 80 fair
//60or less than equal to 70 messts expectations
// for less than equal to  60 below par
public class conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter te value of n");
        int n = sc.nextInt();
        if (n > 90) {
            System.out.println("excellent");

        } else if (n>80 && n<=90) {
            System.out.println("Good");
        } else if (n>70 && n<=80) {
            System.out.println("fair");
        } else if (n>60 && n<=70) {
            System.out.println("meets expectations");
        }
        else {
            System.out.println("poor");
        }


    }
}
