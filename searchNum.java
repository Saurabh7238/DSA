
class arrayExa{
    void serching(){
        int [] arr={25,36,85,45,75,96,14};
        int x=45;
        int ans=-1;
        for (int i=0; i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
                break;

            }
        }
        System.out.println("found "+x+" at"+ans);
    }
}
public class searchNum {

    public static void main(String args[]) {
        arrayExa obj=new arrayExa();
        obj.serching();

    }
}
