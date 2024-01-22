public class test20 {
    public static void main(String[] args) {
        outerclass o=new outerclass();
        o.display();
    }
}

interface my{
    public void show();
}
class outerclass{
    void display(){
        int x=43;

        

        my m=new my() {  //Anonymous class;

            public void show(){
                System.out.println("inner show"+x);
            }
        }; //<----IMP
        m.show();
    }
}