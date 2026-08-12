package Recursion;

import java.util.Scanner;

public class SumOfEvenNumbers {

    static int Soen(int n){
        if (n ==0) return 0;

        if(n%2==0){
            return Soen(n-2)+n;
        }
        else{
            return Soen(n-1);
        }

    }
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        System.out.println(Soen(n));
    }
}
