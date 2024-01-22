public class test34 {
    void fun1(){
        try{
            
            throw new lowBalanceException();  //************User Defined exception********/
            

            
// System.out.println(1/0);
        }catch(Exception e){
        //     System.out.println(e);   //displays error message along with exception name;
        //     System.out.println(e.getMessage());  //will only display the error message;
        //     e.printStackTrace();
            // System.out.println(e);  //automatically calls toString() method;
               System.out.println(e.getMessage());
            }
        }void fun2(){
        //    e.toString();
fun1();
    }
    void fun3(){
        fun2();
    }
    public static void main(String[] args) {
        test34 t=new test34();
       t.fun3();
    }
}

class lowBalanceException extends Exception{  //used for creating user-defined exceptions;i.e must extend exception class
    public String toString(){
       return "balance should not be less than 4332";
    }
    public String getMessage(){
       return "balance should not be less than 4332";
    }

}