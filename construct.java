public class construct {
    int a;
    int b;
    construct(int x,int y){
        System.out.println("it is constructor class");
        a=x;
        b=y;
    }
    int sum(){
        int ans=a+b;
        return ans;
    }
    int sub(){
        int ans1=a-b;
        return ans1;
    }
    int mul(){
        int ans2=a*b;
        return ans2;
    }
    int div(){
        int ans=a+b;
        return ans;
    }
}
 class main{
    public static void main(String args[]){
        construct obj=new construct(5,7);
        System.out.println(obj.sum());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
        System.out.println(obj.div());
        construct obj2=new construct(10,8);
        System.out.println(obj2.sum());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());
        System.out.println(obj2.div());
    }
}

