class Example1{
    int x,y;
    void f1(int x,int y){
        this.x=x;
        this.y=y;

    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
}
class Example2 extends Example1{
    int x,y;
    void f2(int x,int y){
        super.x=x;
        super.y=y;
    }
    void f3(){
        System.out.println(super.x);
        System.out.println(super.y);
    }
}
public class SuperKeyword {
    public static void main(String args[]){
        Example2 e2=new Example2();
        e2.f2(7,5);
        e2.f3();
    }
}
