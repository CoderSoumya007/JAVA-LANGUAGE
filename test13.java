public class test13 {
    public static void main(String[] args) {
        //   kfc kf=new kfc();
      Mykfc k=new Mykfc();
      kfc kf=new Mykfc();
      yourkfc yk=new yourkfc();
      yk.billing();
    }
}
abstract class kfc{
    kfc(){
        System.out.println("kfc franchise");
    }
    void makeItem(){
        System.out.println("pizza ,burger created");
    }
    abstract void  billing();
    abstract void offer();
}
class Mykfc extends kfc{
    Mykfc(){
        System.out.println("franchise succesfully given");
    }
    void billing(){
     System.out.println("billing done");
    }
    void offer(){
        System.out.println("offer provided");
    }

}
class yourkfc extends Mykfc{
    void eat(){
        System.out.println("i ate the burger");
    }

}