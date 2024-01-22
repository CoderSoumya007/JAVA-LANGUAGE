public class ThrowAndThrows {
    public static double area(int r) throws negativeRadiusException {
if(r<0){
    throw new negativeRadiusException();
}
return Math.PI*r*r;
    }

    public static void divide(int a,int b) throws ArithmeticException{
        int c=a/b;
        System.out.println(c);
    } 
    public static void main(String[] args) {
        // area(8);  //must be handled by using try catch block 
        // divide(4,0);  //as exception type declared so no need of try and catch block;
        try{
        double area=area(-8);
        System.out.println(area);
    }catch(Exception e){
        System.out.println(e);  //executes toString() overridden method;
    }
    }
}

class negativeRadiusException extends Exception{
public String toString(){
    return "radius cannot be negative";
}
public String getMessage(){
    return "Radius can be negative";
}
}
