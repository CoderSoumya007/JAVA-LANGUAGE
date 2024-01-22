public class test23 {
    public static void main(String[] args) {
        outer o=new outer();
        outer m=new outer();
        o.x=34;  //***x value will get permanently changed for everyone as it is class related i.e static  */
        o.y=8;  //****y value will only get changed for o object.And remain as it is as for m object as it is non static */
        o.display2();
        m.display2();


    }
}

class outer{
    static int x=43;
    int y=64;
    
        static void display1(){
            System.out.println("value of x is->"+x+"\nand value of y is ");  //cannot acess non static variable or members;
        }
    
        void display2(){
            System.out.println("value of x is->"+x+"\nand value of y is "+y);  //as class is non static hence can access both static and nonstatic members of outer class;
        }
    }
    

