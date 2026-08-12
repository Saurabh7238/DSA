import java.util.Scanner;

public class NoOfDigit {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int Noofinput=0;
        int Orignal_n=n;
        while(n>0)

        {
            n = n / 10;
            Noofinput++;
        }
        System.out.println("NoOfDigit="+Noofinput+"  n="+Orignal_n);
    }

}
