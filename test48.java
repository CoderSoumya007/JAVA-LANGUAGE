import java.net.SocketTimeoutException;

import javax.swing.text.html.HTMLDocument.BlockElement;

public class test48 {
    public static void main(String[] args) {
        int a=2;
        Integer c=new Integer(10);
        
        
        Integer d=Integer.valueOf(100);
        System.out.println(d);
        Integer b=2;   //both are the same ways of initialising the varibles;
                       //automatically calls the valueOf method 
        
    int m=1000;
    Integer n=m;  //this is called auto-boxing;
    Integer n=Integer.valueOf(m);   //this is called Boxing;

    int p=n;  //this is called auto-Unboxing;
    int p=n.intValue();//this is called Unboxing

    byte x=10;
    Byte y=Byte.valueOf(x);  //parameter can be string or byte;
    Byte z=x;  //this is auto-boxing;

    Float g=132.1f;
    Float h=Float.valueOf(244.24f);  //parameter can be flaot or string;

    Double j=Double.valueOf(243.4D);  //parameter can be double or Stirng;

    Character k=Character.valueOf('c');

    Boolean l=Boolean.valueOf("true");
    System.out.println(l);
  

    }
}
