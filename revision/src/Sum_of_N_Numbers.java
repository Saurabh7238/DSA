public class Sum_of_N_Numbers {
    static int SON(int n){
        if(n==0 || n==1) return n;
        return n+SON(n-1);
    }

    public static void main(String[] args) {
        System.out.println(SON(5));
    }

}
