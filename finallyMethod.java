public class finallyMethod {
    public static void main(String[] args) {
        int a=10,b=5;
        while(true){
           try{
            int c=a/b;
            System.out.println(c);
           }catch(Exception e){
            System.out.println(e);
            break;
           }
           finally{  //gets executed no matter
            System.out.println("cleaning up....");
           }b--;
        }
    }
}
