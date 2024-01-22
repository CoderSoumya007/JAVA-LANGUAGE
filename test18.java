
public class test18 {
    public static void main(String[] args) {
        outer ot=new outer();
        ot.outerdisplay();
        outer.inner oi=new outer().new inner(); //creating object of the inner class which is inside outer class;
        System.out.println(oi.y);
    }
}
class outer{
    int x=93;
    class inner{
        int y=9;
        void innerdisplay(){
            x++;
            System.out.println(x);
            System.out.println(y);
        }
    }
    void outerdisplay(){
        System.out.println(x);
        inner i=new inner();
        System.out.println(i.y); //to access inner class members we have to create an objext of the inner class;
        i.innerdisplay();
        System.out.println(x);
    }
}