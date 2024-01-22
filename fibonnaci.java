public class fibonnaci{
    public static void main(String[] args) {
        int n=6;
       System.out.println(recursion(n));
    }
    public static int recursion(int n){
        if(n==0){
            return 0;
        }if(n==1){
            return 1;
        }
        return recursion(n-1)+recursion(n-2);
    }
}