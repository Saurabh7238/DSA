interface demo {
    int x = 15; // implicitly public, static, final
    void f1();
    void f2();// abstract method
}

class box implements demo {
    // Implementing f1() from demo
    public void f1() {
        System.out.println("f1() implemented in box, x = " + x);
    }

    // Extra method f2()
    public void f2() {
        System.out.println("f2() method in box");
    }
}

public class Interface_code {
    public static void main(String[] args) {
        // Using demo reference
        demo d1 = new box();
        d1.f1(); // ✅ Allowed (from interface)
        // To call f2(), cast to box
//        ((box)d1).f2();
        d1.f2();
    }
}
