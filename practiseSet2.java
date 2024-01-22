public class practiseSet2 {
    public static void main(String[] args) {
        telephone tp=new smartphone();  //describes polymorphism;
        tp.lift();
        // tp.foldableScreen();  -->cannot use foldableScreen method as the reference 
                                    // is telephone which does not have a foldableScreen method; 

    }
}

abstract class telephone{
   abstract void ring();
   abstract void lift();
   abstract void disconnect();
}
class smartphone extends telephone{
    public void ring(){
        System.out.println("ringing");
    }
    public void lift(){
        System.out.println("lifting");
    }
    public void disconnect(){
        System.out.println("disconnecting...");
    }
    public void foldableScreen(){
        System.out.println("folding screen");
    }
}