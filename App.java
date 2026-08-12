
public class App{
    public String str_1="i'm public member";
    void printFromClass(){
        System.out.println("within class "+str_1);
    }


    public static void main(String args[]) {
        App obj = new App();
        obj.printFromClass();
        System.out.println(obj.str_1);
        App2 obj2=new App2();
//        System.out.println(obj2.str_1);

        obj2.printFromOutsideClass();

    }

    }class App2 {
    void printFromOutsideClass() {
        App obj = new App();
        System.out.println("From another class: " + obj.str_1);
    }
}

