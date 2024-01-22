class superclass {
    private int x;  //using getters and setters we can access private variables outside class;
    int y;

    public superclass(){    //will get invoked by default if not explicitly invoked;
        System.out.println("in am superclass constructor");
    }
    public superclass(int x){   //overloaded constructor will never get called by default;
        System.out.println("This is an overloaded constuctor of super class with value of x as "+x);
    }

    public void setx(int x) {
this.x=x;
    }public void sety(int y) {
this.y=y;
    }public int getx() {
return x;
    }public int gety() {
return y;
    }
}


class  subclass extends superclass{    //***CHILD CLASS INHERITING PROPERTIES FROM PARENT CLASS  */
int z;
public subclass(){
    System.out.println("I am subclass/derived class constructor");
    System.out.println();
}public subclass(int x,int y){

    super(x);  //IMP-->CALLS THE OVERLOADED CONSTRUCTOR OF SUPER CLASS HAVING 
               //THE SAME NO OF ARGUMENTS AS THIS KEYWORD SUPER HAVE;IF NOT GIVEN THEN BY DEFAULT
               // THE NON-OVERLOADED CONSTRUCTOR GETS INVOKED
    System.out.println("This is an overloaded constructor of subclass with value of y as "+y);
}
public void setz(int z){
    this.z=z;
}public int getz(){
    return z;
}
}

class grandchild extends subclass{
grandchild(){
System.out.println("This is an constructor of grand class");
}
grandchild(int z){
    // super(0,3);
System.out.println("This is an constructor of grand class with value of z as "+z);
}
}

public class constructorInheritance {
    public static void main(String[] args) {
        superclass p=new superclass();   //**IMP-->BUT ON CALLING SUPERCLASS CONSTRUCTOR ONLY
                                             // SUPERCLASS CONSTRUCTOR GETS CALLED NOT THE SUBCLASS'S CONSTRUCTOR */

        subclass b=new subclass(69,96);   //IMP-->ON CALLING SUBCLASS CONSTRUCTOR
                                    // BOTH SUPERCLASS AND SUBCLASS CONSTRUCTORS GET AUTOMATICALLY INVOKED;
        grandchild g=new grandchild();
        
        b.setx(78);
        // b.sety(56);  //if not initialized it gets assigned to 0 by default;
        b.setz(9);
        
        p.setx(4);
        p.sety(5);
        
        g.z=789;
        // grandchild h=new grandchild(g.z);

       

       


        System.out.println( p.getx());
        System.out.println( p.gety());
        System.out.println();

        System.out.println( b.getx());//***as b has inherited properties from superclass hence we can 
                    //access its variables from child class; */
        System.out.println( b.gety());  //IMP-->GETS INITIALIZED TO 0,I.E DOes NOT INHERITS THE VALUE OF THE VARIABLE INHERITED;
        System.out.println( b.getz());

        // System.out.println(p.getz());  //**will return error as getz() will not be declared for superclass */
        }
}
