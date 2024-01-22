public class test6 {
    static int sum(int ...A){
        int  sum=0;
for(int i=0;i<A.length;i++){
     sum=sum+A[i];
}return sum;
    }
    public static void main(String[] args) {
       int s= sum(1,2,3,4,5,6,7,8,9);
       System.out.println(s);
    }
}
