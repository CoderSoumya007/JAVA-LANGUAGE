public class test25 {

    //3 ways of initialising final members;
    final int min=4; //1
    final static int max;
    final int med;

    static{   //2
        max=43;
    }

    test25(){  //3
        med=53;
    }
    public static void main(String[] args) {
        test25 t=new test25();
        System.out.println(t.min+" "+max+" "+t.med);
    }
}
