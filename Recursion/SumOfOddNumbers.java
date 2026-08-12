package Recursion;

import java.util.Scanner;

public class SumOfOddNumbers {

    static int Soon(int n){
        if (n == 0) return 0;

        if(n%2==0){
            return Soon(n-1);
        }
        else {
            return Soon(n-1)+n;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Soon(n));
    }
}
