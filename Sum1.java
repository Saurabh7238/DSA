class Examp{
    void sum(){
        int x=0;
        int [] arr={25,65,75,25,35,25};
        for(int i=0;i<arr.length;i++){
x=x+arr[i];
            System.out.println("value of x "+ x +" current value of i "+ arr[i] +" Sum of x and i = "+ x);
        }
    }
}



public class Sum1{
    public static void main(String args[]){

        Examp obj=new Examp();
        obj.sum();
    }
}
