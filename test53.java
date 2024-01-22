public class test53 {

    static int co=0;
    public static void main(String[] args) {

        int count=0;

       mylambda m=(s)->{
    System.out.println(s);
    System.out.println("count "+count);  //*******IMP****Local variables referenced from a lambda expression must be final or 
                                             //Effectively final;
    System.out.println("instance variable count "+co++);  //but instance variables can be accessed from lambda Expression and 
                                                          //can also be modified whereas local variables canot be modified;
    };


       m.display("Hello world");

//     mylambda m=(a,b)->a+b;  //just an expression is required hence called lambda Expression
                              //no need to mention the return type also;
//    System.out.println(m.display(40,50));
//     }
}
}

@FunctionalInterface
interface mylambda{
    public void display(String s);
}



