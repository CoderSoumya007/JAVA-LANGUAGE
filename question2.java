import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        int[]array={4,5,34,5,3,95};
        Scanner sc=new Scanner(System.in);
        int i=0;
        int ind;
        while(i<5){
           try{
            ind=sc.nextInt();
            System.out.println(array[ind]);
            break;
           }catch(ArrayIndexOutOfBoundsException e){
            i++;
            continue;
           }

        }if(i==5){
            try{
           throw new maxretryCustomException();  //throw custom exception;
        }catch(Exception e){
            System.out.println(e);
        }
        }

    }
}
class maxretryCustomException extends Exception{
    public  String toString(){
return "maRetriesReached";
    }
}