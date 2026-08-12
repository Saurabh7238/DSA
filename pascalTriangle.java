import java.util.Scanner;

public class pascalTriangle {
    static void M1(int rows){

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < rows-i; j++) {
                System.out.print(" ");
            }
            int number=1;
            for (int j = 0; j <=i; j++) {
                System.out.print(number+" ");
                number=number*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of row");
        int row= sc.nextInt();
        M1(row);
    }

}
