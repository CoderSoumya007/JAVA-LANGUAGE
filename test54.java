public class test54 {
    public static void main(String[] args) {


        MyLambda ml=constructorReferenceByLambdaExpression::new;  //******new keyword is used when wwe have to call constructor
                                                           //of any class */

                                                           
        // MyLambda ml=test54::reverse;  //*********This is called Method Reference.We just have to refer to a method name 
                                     //if method is static then just we have to use classname or else we have to make an 
                                     //object of the class and then we can access the method .*/

        ml.display("soumya ranjan panda");
    }

    public static void reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
    }
}

@FunctionalInterface
interface MyLambda{
    public void display(String s);
}

class constructorReferenceByLambdaExpression{
    public constructorReferenceByLambdaExpression(String s){
  StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
    }
}