package Recursion;

public class noOFDigit {

    static int NOD(int n){
        if (n==0) return 0;


        return NOD(n/10)+1;
    }
    public static void main(String[] args) {
        System.out.println(NOD(88958656));
    }
}
