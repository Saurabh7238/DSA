package Recursion;

public class Least_Common_Factor {

    static int gcd(int x, int y) {

        if (y == 0)
            return x;

        return gcd(y, x % y);
    }

    static int lcm(int x, int y) {

        return (x * y) / gcd(x, y);
    }

    public static void main(String[] args) {

        System.out.println(lcm(15, 24));
    }
}