public class test22 {
    public static void main(String[] args) {
        kfc my=new mykfc(){

        };
        
    }
}
interface KFC{
    abstract void bill();
    private  void take(){
        System.out.println();
    }

}
abstract class kfc{
    kfc(){
        System.out.println("kfc constructor called");
    }
    void makeitem(){
        System.out.println("item made");
    }
   abstract void billing();

//    default void dinein(){  //default methods are only allowed in Interfaces;but abstract class can have private and static methods
//     System.out.println();
//    }

}
abstract class mykfc extends kfc{
    mykfc(){
        System.out.println("mykfc constructor called");
    }
    @Override
    void billing() {
        System.out.println("billing made");
    }
}