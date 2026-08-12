package Recursion;

import java.util.Scanner;

public class Multiplse {
    static int mul(int a, int b){
        if (b==1) return a;

        System.out.println (mul(a,(b-1)));

        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a and b ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(mul(a,b));
    }
}
