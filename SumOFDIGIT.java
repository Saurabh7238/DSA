import java.util.Scanner;

public  class SumOFDIGIT {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int Sumofdigit=0;
        int Orignal_n=n;
        while (n>0){
            Sumofdigit +=n%10;
            n=n/10;
        }
        System.out.println("sumofdigit = "+Sumofdigit);
    }
}
