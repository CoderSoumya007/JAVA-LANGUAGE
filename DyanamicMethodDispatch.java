class phone{
    public void antenna(){
        System.out.println("I have a visible long antenna");
    }public void Screen(){
        System.out.println("I have a pixellated screen");
    }
    }


class smartphone extends phone{
    public void hotspot(){
        System.out.println("I have hotspot to share internet");
    } 
    
    @Override
    public void Screen(){
        System.out.println("I have oled touch screen");
    }
}
public class DyanamicMethodDispatch {
    public static void main(String[]args){
        phone ph=new smartphone();  //***IMPORTANT */
        // smartphone smph=new phone();  //***IS NOT ALLOWED,WILL THROW AN ERROR */
ph.antenna();
ph.Screen();
// ph.hotspot();   //will throw error,as not allowed;
    }
}
