import java.io.FileReader;

public class test38 {
    static void meth3() {
        FileReader f=new FileReader("my.txt");  //must be handled as the java.io.fileReader throws Exception;
                                                      //if here exception arises then the rest code will be unreachable;so if we wan
                                                //a part to be executed surely then we have to use "finally" block;
        System.out.println("ewaga");
        return ;
    }
    public static void main(String[] args) {
        meth3();
    }
}
