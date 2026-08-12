package Recursion;

public class power {
    static int pow(int p, int q){

        if (q == 0) return 1;

        int smallAns=pow(p,q-1);
        return smallAns*p;
//
//        Method no. 2

//        if(q==0) return 1;
//        int smallPow=pow(p,q/2);
//        if (q%2==0) {
//            return smallPow*smallPow;
//        }
//        return p*smallPow*smallPow;
    }


    public static void main(String[] args) {
        System.out.println(pow(5,3));
    }


}

////DRY RUN
//pow(5,4)
//│
//        ├── pow(5,3)
//│   │
//        │   ├── pow(5,2)
//│   │   │
//        │   │   ├── pow(5,1)
//│   │   │   │
//        │   │   │   ├── pow(5,0)
//│   │   │   │      return 1
//        │   │   │   │
//        │   │   │   return 1×5 = 5
//        │   │   │
//        │   │   return 5×5 = 25
//        │   │
//        │   return 25×5 = 125
//        │
//        return 125×5 = 625

