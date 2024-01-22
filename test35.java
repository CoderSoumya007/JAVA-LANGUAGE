public class test35 {

    void fun1(int balance) throws Exception{
        if(balance<5000){
            throw new lowBalanceException(); //as it is not handled using try-catch block hence the mehtod must have the throws signature;
        }
    }


        void fun2(int balance) throws Exception{   //as it is also not handled using try catch block hence this method must also be 
                                                   //handled using throws keyword;
        //    e.toString();
        fun1(balance);
    }


    void fun3(int balance) throws Exception{
        fun2(balance);
    }


    public static void main(String[] args) {
        test35 t=new test35();

        
        try{
       t.fun3(3400);
    }catch(Exception e){
        System.out.println(e);
    }
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