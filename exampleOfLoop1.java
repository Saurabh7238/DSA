 class example {
    void arrayExample(){
        int [] arr={15,17,22,33,25,65};
        for(int row:arr){
            System.out.println(row);
        }
    }
}
public class exampleOfLoop1{
    public static  void main(String args[]){
        example obj=new example();
        obj.arrayExample();
    }
}