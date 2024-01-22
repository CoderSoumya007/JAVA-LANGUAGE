import java.util.*;
public class Assignment2Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter four colors");
        String s[]=new String[4];
        for(int i=0;i<4;i++){
            s[i]=sc.next();
        }
        try{
            Integer.parseInt(s[0]);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
        try{
            System.out.println("Enter one more color");
            s[5]=sc.next();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("The colors entered are:");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
