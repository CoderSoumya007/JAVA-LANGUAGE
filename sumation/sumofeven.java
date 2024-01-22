package sumation;

public class sumofeven {
  
    public static void main(String[]args){
        modifiers m=new modifiers();
        c1 c=new c1();
        int i=0,n=10;
        int sum=0;
        while(i<=n){
            if(i%2==0){
            sum=sum+i;
            }i++;
        }
        System.out.printf("The sum of even numbers upto n is:%d",sum);
        System.out.println(m.x);
        // System.out.println(m.y);  //AS PRIVATE SO CANNOT BE ACCESSED FROM OUTSIDE THE CLASS;
        System.out.println(m.z);
        System.out.println(m.a);
        c.meth2();

    }
}
class modifiers{
    public int x=43;
    private int y=34;
    int z=344;
    protected int a=535;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
class c1 extends modifiers{
public void meth2(){
    x=34;
    // y=342; //CANNOT BE ACCESSED FROM SUBCLASS TOO.
    z=54;
    a=34;
    System.out.println(x);
    // System.out.println(y);  ///AS PRIVATE SO CANNOT BE ACCESSED FROM OUTSIDE THE CLASS;
    System.out.println(z);
    System.out.println(a);
}
}
