import java.util.Scanner;

public class timeCople {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int count =0;
        System.out.println("enter N ");
        int N= sc.nextInt();

        for (int i=1; i <N ; i*=2) {
            count++;
            System.out.println(i);

        }
        System.out.println(":- "+count);

    }

}
