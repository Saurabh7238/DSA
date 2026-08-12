public class Fast_Power {
static int FP(int p ,int q){
    if (q==0)return 1;
    if(q%2==0)
    {return FP(p,q/2)*FP(p,q/2);}

    return p*FP(p,q/2)*FP(p,q/2);
}

    public static void main(String[] args) {
        System.out.println(FP(5,4));
    }
}
