@interface myAnno{
    String name();
    String project();
    String date() default "today";
    String version() default "2.0";
}
public class test51 {
    public static void main(String[] args) {
        @myAnno(name="soumya",project="Bank")  //must have all the parameters listed in the annotation interface;
        int x;

    }
}
