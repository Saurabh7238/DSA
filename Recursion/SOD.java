package Recursion;

public class SOD {
    static int SumOfDigit(int n){
        if (n>=0 && n<=9) return n;
        return SumOfDigit(n/10)+(n%10);
    }


    public static void main(String args[]){
        System.out.println(SumOfDigit(5683));
    }
}
