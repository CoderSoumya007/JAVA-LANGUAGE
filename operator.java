
public class operator {
    public static void main(String[] args) {
    int n=192;int sum=0;
    do{
        do{
           sum+=n%10;
           n=n/10;

        }while(n!=0);
        n=sum;
    }while(n>=10);
    System.out.println(sum);
    }
}
