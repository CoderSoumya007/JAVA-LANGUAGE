public class test24 {

    static{
        int s=4;  //this variable cant be accessed anywhere else;
        System.out.println("Block1");  //static blocks get executed first in the order of presentation;
    }
    static{
        System.out.println("Block2");
    }
    public static void main(String[] args) {
        System.out.println("Main");
    }
}
