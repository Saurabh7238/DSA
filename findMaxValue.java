import java.util.Scanner;
class Exam{
    void arrayExam(){
        int [] arr={81,61,73,85,92,67,79,90,57,80};
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter your choice");
//       int x=sc.nextInt();
        int x=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>x){
                x=arr[i];
            }


        }
        System.out.println(x);
    }
}


public class findMaxValue {
    public static  void main(String args[]){
        Exam obj=new Exam();
        obj.arrayExam();
    }

}
