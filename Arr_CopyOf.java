
import java.util.Arrays;



class A2 {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    void Arr_copyOf_Arr() {

        int[] arr1 = {25, 26, 27, 28, 29, 30};
        System.out.println("copied array:- ");
        printArray(arr1);

        int[] arr_2 = Arrays.copyOf(arr1, 3);
        System.out.println("copied array:- ");
        printArray(arr_2);
    }
}



public class Arr_CopyOf {
    public static void main(String args[]){
        A2 obj=new A2();
        obj.Arr_copyOf_Arr();
    }
}

