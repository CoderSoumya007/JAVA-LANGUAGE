public class test14 {
    public static void main(String[] args) {
        
        govPolicy g;  //As abstract/Interface can only have reference;\
        
        govPolicy g=new Hospital(); //hospital can be referred as gov policy but then only govPolicy methods will be accessible;
        govPolicy gp=new Hospital();
        // gp.billing();  undefined for the interface 
        gp.deliveryWard();
        Hospital hp=new Hospital();
        hp.billing();
    }
}
 interface govPolicy{
    void emergencyWard();
    void infantWard();
    void deliveryWard();
}
class Hospital implements govPolicy{
    public void emergencyWard(){
        System.out.println("emergency center");
    }
    public void infantWard(){
        System.out.println("infant center");
    }
    public void deliveryWard(){
        System.out.println("delivery center");
    }
    public void billing(){
        System.out.println("billing done here");
    }
}
