public class test77 {
    public static void main(String[] args) {
        show(new Integer[]{1,2,3,4,56});
        show(new Float[]{1.645f,2.65f,3.43f,4.4f,56.4f});
        // show(new String[]{"soumya","Ranjan","Panda","Csit"});
    }

    public  static <T extends Number> void show(T[] arr){ //Generic Methods
        for(T x:arr){
            System.out.println(x);
        }

    }
}
