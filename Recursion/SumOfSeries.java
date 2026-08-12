package Recursion;

import java.util.Scanner;

public class SumOfSeries {
    static int sos(int a){
        if(a==0) return 0;
        if(a%2==0){
            return sos(a-1)-a;
        }
        else {
        return sos(a-1)+a;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n= sc.nextInt();
        System.out.println(sos(n));
    }
}
