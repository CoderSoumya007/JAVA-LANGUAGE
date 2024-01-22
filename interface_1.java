public class interface_1 {
public static void main(String[] args) {
    mysmartphone mys=new mysmartphone();
    mys.record4kvideo();
    // mys.greet();  //will throws an error as it is defined private;
    String[] ar=mys.getNetwork();
    for(String element:ar){
        System.out.println(element);
    }
    camera cam1=new mysmartphone();
    // cam1.getNetwork();  //cannot be called as getnetwork method is undefined for camera interface
    cam1.takesnap();
}
}

interface camera{
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
interface router{
    String[] getNetwork();
void connectToNetwork(String network);
}

 class cellphone{
    void callNumber(int phonenumber){
        System.out.println("calling"+phonenumber);
    }
    public void pickup(){
        System.out.println("connecting...");
    }
}

class mysmartphone extends cellphone implements camera,router{
public void takesnap(){
    System.out.println("taking snap which is defined in class mysmartphone");
}
public void recordvideo(){
    System.out.println("recording video");
}
public void record4kvideo(){
    System.out.println("taking snap and recording in 4k(overridden)");
}
public String[] getNetwork(){
System.out.println("getting list of networks");
String[] networklist={"harry","carry","soumya","land"};
return networklist;
} 
public void connectToNetwork(String network){
    System.out.println("connecting to"+network);
}
}