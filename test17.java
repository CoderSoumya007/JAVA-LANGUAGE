public class test17 {
    public static void main(String[] args) {
        System.out.println(test1.s);  //*****static varibles of interface are accessed using interface name */
        test1.meth3(); //static methods of interfaces are accessed using interface name;
        my t=new my();
        t.meth5();
        t.meth7();

test1 t1=new my();  //***************IMP******** */
// t1.meth3();  //not valid because static methods cannot be overrided;and can only be accessed in static way;

    }
}
interface test1{
    int s=34;  //variables are by default static and final;
public abstract void meth1(); //methods inside interface are bydefault abstract and public.
void meth2();
public static void meth3(){
    System.out.println("method of test3");
}
public default void meth5(){  //default methods are also inherited and they also can be overrided;
    System.out.println("default method called");
}

//Interfaces can have static,private and default methods;
private void meth6(){  //have to be write a default method so that this method can be accessed;
    System.out.println("private methods called");
}
default void meth7(){  //default method is written to access the private method;
    meth6();
}
}

interface Interface1 extends test1{
      static void meth3(){
        System.out.println("changed");
    }
    void meth4();
    final int s=34; // can have final member but not final methods;
    final void meth44(){  //only public, private, abstract, default, static and strictfp are permitted
        System.out.println(432);
    }
    
}

class my implements Interface1{
    public void meth1(){}
    public void meth2(){}

    public void meth3(){  //static methods cannot also be overrided
        System.out.println("static method overrided");
    }
    public void meth4(){}
    // public void meth5(){}  //default methods are also inherited and they also can be overrided;

}