import java.util.Scanner;

public class factorialRecursion {
    static int factorial(int n){
      if (n==0){
          return 1;
      }
        int samallAns=factorial(n-1);
      int ans=n*samallAns;
      return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n ");
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
}
