import java.util.Scanner;


class arr_01{
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    void arr2() {
            Scanner sc = new Scanner(System.in);

            System.out.println("enter the size of array :- ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("enter the array element " + n);
            for (int i =0; i < arr.length; i++) {
                arr[i] = sc.nextInt();


//
            }
        PrintArray(arr);
        }
    }

    public class IMP{
        public static void main (String args[]){
            arr_01 obj=new arr_01();
            obj.arr2();

        }
    }

