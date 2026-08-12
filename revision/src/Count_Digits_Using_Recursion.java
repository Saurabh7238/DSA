public class Count_Digits_Using_Recursion {
    static int CDUR(int n){
        if(n<10) return 1;

        return CDUR(n/10)+1;
    }

    public static void main(String[] args) {
        System.out.println(CDUR(1346651185));
    }

}
