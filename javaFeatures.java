public class javaFeatures {
    public static void main(String[] args) {
        smartphone msp=new smartphone();
        msp.ring();
       msp.lift();
       msp.disconnect();
       camera cmp=new smartphone();  //polymorphism feature.
       cmp.record4kvideo();
    //    cmp.ring(); //not a defined method for camera class;
    //    cmp.greet(); //not visible as the method is declared private
    }
}

    abstract class  telephone
    {
        abstract void ring();
        abstract void lift();
        abstract void disconnect();
    }

    interface camera{  //class containing undefined and defined methods.
        public void takesnap();
    public void recordvideo();
    private void greet(){
        System.out.println("good morning");
    }
    default void record4kvideo(){  //default method;
      greet();  //to be called here;
        System.out.println("recording in 4k");
    }

    }
    class smartphone extends telephone implements camera{ //inheritance
    void ring(){
        System.out.println("ringing");
    }
    void lift(){
        System.out.println("lifting my smartphone");
    }
    void disconnect(){
        System.out.println("disconnecting your call");
    }
   public void takesnap(){
        System.out.println("taling snap");
    }
    public void recordvideo(){
        System.out.println("recording video");
    }
    }

