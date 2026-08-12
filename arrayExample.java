 class Example {
    void multiArrays(){
        int [][] arr={{56,43,6},{37,7,8},{12,56,81}};
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }

        }


    }
}
public class arrayExample{
    public static void main(String args[]){
       Example obj=new Example();
        obj.multiArrays();
    }
}