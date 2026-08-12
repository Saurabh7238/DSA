class A {
    public int  a = 5;
    int b = 7;

    void fun() {
        int c = a + b;
        System.out.println("Sum: " + c);
        {
            int d=10;
            System.out.println(d);
        }
    }

}


public class BlockLevel {
    public static void main(String[] args) {
        A obj = new A();
        obj.fun();
        B obj2 = new B();
        obj2.f3();

    }

}
class B{
    void f3(){
        A obj = new A();
        System.out.println(obj.a);

    }
}

