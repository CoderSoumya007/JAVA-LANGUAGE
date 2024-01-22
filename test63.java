import java.io.RandomAccessFile;

public class test63 {
    public static void main(String[] args) throws Exception {
        RandomAccessFile rf=new RandomAccessFile("c:/Users/soumy/Documents/JAVA LANGUAGE/copiedFile2.txt","rw");
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('R');
        System.out.println((char)rf.read());
        rf.skipBytes(3);  //will skip the given no of bytes;
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());  //will return the current file poinbter location
        rf.seek(3);  //pointer will move to the given location;
        System.out.println((char)rf.read());
    }
}
