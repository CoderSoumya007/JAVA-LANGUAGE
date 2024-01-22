class superclass {
    private int x;  //using getters and setters we can access private variables outside class;
    int y;

    public void setx(int x) {
this.x=x;
    }

    public void sety(int y) {
this.y=y;
    }

    public int getx() {
return x;
    }

    public int gety() {
return y;
    }
}
class  subclass extends superclass{    //***INHERITING PROPERTIES FROM SUPERCLASS  */
int z;
public void setz(int z){
    this.z=z;
}public int getz(){
    return z;
}
}

public class Inheritance {
    public static void main(String[] args) {
        superclass p=new superclass();
        subclass b=new subclass();
        b.setx(78);
       b.setz(9);

       p.setx(4);
       p.sety(5);


        System.out.println( p.getx());
        System.out.println( p.gety());
        System.out.println();

        System.out.println( b.getx());//***as b has inherited properties from superclass hence we can 
                    //access its variables from child class; */
        System.out.println( b.gety());  //IMP-->GETS INITIALIZED TO 0,I.E DO NOT INHERITS THE VALUE OF THE VARIABLE INHERITED;
        System.out.println( b.getz());

        // System.out.println(p.getz());  //**will return error as getz() will not be declared for superclass */
        }
}
