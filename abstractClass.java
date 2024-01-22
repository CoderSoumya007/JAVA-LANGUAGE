 abstract class smartphone{
    public void calling(){
        System.out.println("calling...");

    }
    public abstract void dronecamera();  //as they are not defined so we cant be able to create object of them;
    public abstract void autorepairScreen();  //for creating objects we need to have a concrete class,i.e all the methods are defined;
    public abstract void foldable();  //so for this we have to declare them abstract so we dont have to create an object;we cant leave a method undefined.
}
abstract class smartphoneVER1 extends smartphone{
    public void dronecamera(){
        System.out.println("flying camera");
    }
    public void autorepairScreen(){
        System.out.println("auto repairing...");
    }
    public abstract void expandable_memory();
}

 class smartphoneVER2 extends smartphoneVER1{  //THIS IS A CONCRETE CLASS;
    public void foldable(){
        System.out.println("i can get fold");
    }
    public void expandable_memory(){
        System.out.println("if your ram is 4gb you can expand it upto 8gb");
    }
}
public class abstractClass {
    public static void main(String[] args) {
        smartphoneVER2 obj=new smartphoneVER2();
        obj.calling();
        obj.dronecamera();
        obj.autorepairScreen();
        obj.foldable();
    }
}
