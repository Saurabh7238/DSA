


import java.util.Scanner;
public class takeInput {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array :- ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the "+n+" no.element of array ");
                for(int i=0;i<arr.length;i++){

                    arr[i]= sc.nextInt();
                }
        System.out.println("current value");
                for (int i=0;i<arr.length;i++){

                    System.out.println(arr[i]);

                }
//                trying to copy arr to arr_2
        int[] arr_2 = arr.clone();
        for (int i = 0; i < n; i++) {



            }
        System.out.println("changed value");
        for (int i=0;i<n;i++){
            System.out.println(arr_2[i]);

        }


    }
}
