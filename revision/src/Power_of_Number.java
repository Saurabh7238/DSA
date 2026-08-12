public class Power_of_Number {
    static int PON(int n){
        if (n==0) return 1;

        return n* PON(n-1);
    }



    public static void main(String args[]){
        System.out.println(PON(5));
    }
}
