import java.lang.reflect.*;

public class test52 {
    public static void main(String[] args) {
        Class c=my.class;  //to get the total defination of a class

        // System.out.println(c.getName());
        // System.out.println(c.getClassLoader());
        
        // Field f[]=c.getDeclaredFields();
        // for(Field fi:f){
        //     System.out.println(fi);
        // }


        Constructor cons[]=c.getConstructors();
        for( Constructor x:cons){
            System.out.println(x);
        }


        // Method meth[]=c.getDeclaredMethods();
        // for(Method x:meth){
        //     System.out.println(x);
        // }


        Method method[]=c.getMethods();
        // for(Method x:method){
        //     System.out.println(x);
        // }


        Parameter param[]=method[2].getParameters();
        for(Parameter x:param){
            System.out.println(x);
        }
    }
}

class my{
    public int a;
    private int b;
    protected int c;
    int d;

    public my(){}  //non parameterized constructor 

   public my(int a,int b){}  //parameterized constructor

    public void a(int x,int y){}
    public void b(){}
    public void c(){}

}