import java.util.Scanner;
public class findRepeatNumber {
    static int FirstReapeatNumber(int arr[]){
        int n= arr.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter "+n+" element");{
            for (int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            System.out.println("unique value:- "+FirstReapeatNumber(arr));
        }
    }
}
