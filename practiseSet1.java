public class practiseSet1 {
    public static void main(String[] args) {
       fountainpen fp=new fountainpen();
       fp.refill(); 
    }
}
abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{
    void write(){
        System.out.println("smooth writing");
    }
    void refill(){
        System.out.println("refill with a good quality ink fakir admi");
    }
    void changeNib(){
        System.out.println("change your nib laude");
    }
}
