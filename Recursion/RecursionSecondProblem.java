package Recursion;

import java.util.Scanner;

public class RecursionSecondProblem {
    static void decreasingRecursion(int n){
        if (n==1){
            System.out.print(n);
            return;
        }
        System.out.println(n);
        decreasingRecursion(n-1);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n ");
        int n=sc.nextInt();
        decreasingRecursion(n);
    }
}
