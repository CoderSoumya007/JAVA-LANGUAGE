import sumation.usingPackages;
public class checkingAcess {  //THIS IS LIKE ACCESSING THE VARIABLES IN THE WORLD;

    public static void main(String[] args) {
        System.out.println("using packages");
        using uc=new using();
        usingPackages up=new usingPackages(); //CREATING OBJECT OF THE CLASS HAVING THE VARIABLES(PRIVATE..ETC);
        System.out.println(up.x);     //CAN BE ACCESSED AS THE VARIABLE IS PUBLIC;
        // System.out.println(up.y);  //CANNOT BE ACCESSED AS THE VATIABLE IS PRIVATE;
        // System.out.println(up.z);  //CANNOT BE ACCESSED AS THE VATIABLE IS DEFAULT;
        // System.out.println(up.a);  //CANNOT BE ACCESSED AS THE VATIABLE IS PROTECTED;
        uc.meth();
    }
}

class using extends usingPackages{  //THIS IS LIKE ACCESSING THE VARIABLES IN THE SUBCLASS;
public void meth(){
    System.out.println(x);  //CAN BE ACCESSED AS THE VARIABLE IS PUBLIC;
    // System.out.println(y);  //CANNOT BE ACCESSED AS THE VARIABLE IS PRIVATE;
    // System.out.println(z);  //CANNOT BE ACCESSED AS THE VARIABLE IS DEFAULT;
    System.out.println(a);  //CANNOT BE ACCESSED AS THE VARIABLE IS PROTECTED;
}
}
