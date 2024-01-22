public class armstrong{
    boolean check(int n){
        int newnum=0;
        int num=n;
        while(n>0){
            int rem=n%10;
            n=n/10;
            newnum=newnum+(rem*rem*rem);
        }if(newnum==num){
            return true; 
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        armstrong arm=new armstrong();
       System.out.println(arm.check(153));
    }
}