public class test33 {
    public static void main(String[] args) {
        int arr[]={2,34,2,1,0,43};
        try{
            int a=arr[1]/arr[4];
            System.out.println(a);

            try{  //nested try catch block;
                System.out.println(arr[9]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            
        }
        catch(ArithmeticException e){ //if first catch block gets executed then the other catch blocks dont get executed;
            System.out.println("dsbds");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
