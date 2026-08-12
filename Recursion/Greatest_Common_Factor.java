package Recursion;

import java.util.Scanner;

public class Greatest_Common_Factor {
    static int gcd(int x, int y){
        if(y==0) {return x;}
        return gcd(y,x%y);


    }
    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int x= sc.nextInt();
//        int y=sc.nextInt();
        System.out.println(gcd(15,24));
    }
}
//LCM(a,b) = (a × b) / GCD(a,b)