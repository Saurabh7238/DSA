class exampleOfLoop {
    void demoArray(){
        int [] arr={25,30,35,40,50};
        for (int i=0;i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
public  class exampleOfLoops{
    public static void main(String args[]){
        exampleOfLoop obj=new exampleOfLoop();
        obj.demoArray();
    }
}
