import java.io.ByteArrayInputStream;

public class test59 {
    public static void main(String[] args) throws Exception{
        byte b[]={'q','w','e','r','t','y'};
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        System.out.println(bis.markSupported());
        
        String s=new String(bis.readAllBytes());
        System.out.println(s);

        String si=new String(b);
        System.out.println(si);

        //***OR **********/

        // int x;
        
        // while((x=bis.read(b))!=-1){
        //     System.out.print((char)x);
        // }
    }
}
