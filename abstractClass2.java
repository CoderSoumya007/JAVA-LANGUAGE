public class abstractClass2 {
    public static void main(String[] args) {
        iphone obj=new iphone();
        redmi obj1=new redmi();
        show(obj1);
    }
    public static void show(phone obj){
        obj.showConfig();
    }
}
//FUNCTIONALITY OF ABSTRACT CLASS(PREVENTS CREATING COMMON METHODS AGAIN OF DIFFERENT CLASSES)
abstract class phone{
  public abstract void showConfig();
}

class iphone extends phone{
    public void showConfig(){
        System.out.println("IOS version 3");

    }
}

class redmi extends phone{
    public void showConfig(){
System.out.println("miui version 13");
    }
}
