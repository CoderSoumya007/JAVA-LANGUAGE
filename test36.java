public class test36 {
    static void meth1(){
        try{
        throw new Exception();
    } catch (Exception e) {
        // TODO Auto-generated catch block
       System.out.println(e);
    }
finally{
    System.out.println("finally executed");
}
    }
    public static void main(String[] args) {
        meth1();
    }
}
