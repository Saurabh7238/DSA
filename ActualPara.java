 class Demo {
    static void sum(int x,int y){
        x--;
        y-=2;
        System.out.println(x+ ":" +y);
    }
}
 class ActualPara{
    public static void main(String args[]){
//        Demo obj=new Demo();
            int p=10;
            int q=15;
        Demo.sum(p,q);
        System.out.println(p+q);
    }
 }

