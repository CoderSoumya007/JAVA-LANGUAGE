public class strongNum {
    int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    boolean check(int n){
        int num=n;
        int newnum=0;
        while(n>0){
            int rem=n%10;
            int fac=factorial(rem);
            newnum+=fac;
            n=n/10;
        }
        if(newnum==num){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        strongNum str=new strongNum();
        System.out.println(str.check(1458));
    }
}
