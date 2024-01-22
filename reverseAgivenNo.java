public class reverseAgivenNo {
    int reverse(int n){
       int newnum=0;
       while(n>9){
        int rem=n%10;
        newnum=newnum+rem;
        newnum=10*newnum;
        n=n/10;
       }
       return newnum+n;
    }
    public static void main(String[] args) {
        reverseAgivenNo rv=new reverseAgivenNo();
int rev=rv.reverse(875);
System.out.println(rev);
    }
}
