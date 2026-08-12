public class Fibonacci_Number {
    static int fib(int n){
        if (n==0 || n==1) return n;
        int First=fib(n-1);
        int Second=fib(n-2);
        int k=First+Second;
        return k;
//        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
