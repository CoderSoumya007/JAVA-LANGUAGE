public class abstractClass1 {
    public static void main(String[] args) {
        iphone obj=new iphone();
        redmi obj1=new redmi();
        show(obj);
    }
    public static void show(iphone obj){
obj.showConfig();
    }
    public static void show(redmi obj1){
        obj1.showConfig();
    }
}

class iphone{
    public void showConfig(){
        System.out.println("IOS version 3");

    }
}

class redmi{
    public void showConfig(){
System.out.println("miui version 13");
    }
}
