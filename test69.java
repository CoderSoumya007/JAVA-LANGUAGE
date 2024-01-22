import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class test69 {
    // public static void main(String[] args) throws Exception{
    //     customer cum[]=new customer[3];
    //     cum[0]=new customer("Soumya",001);
    //     cum[1]=new customer("Ranjan",002);
    //     cum[2]=new customer("Panda",003);



    //     FileOutputStream fos=new FileOutputStream("c:/Users/soumy/Documents/JAVA LANGUAGE/StudentChallenge2.txt");
    //     ObjectOutputStream oos=new ObjectOutputStream(fos);

    //     oos.writeInt(cum.length);  //to store the numbers of data the file is storing so that it will help during retrieving of the data;
    //     for(customer c:cum){
    //         oos.writeObject(c);
    //     }

    //     oos.close();
    //     fos.close();

    // }
    public static void main(String[] args) throws Exception{
    FileInputStream fis=new FileInputStream("c:/Users/soumy/Documents/JAVA LANGUAGE/StudentChallenge2.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);

   int i=0;
   int length=ois.readInt();
   while(i<length){
    customer c;
    c=(customer)ois.readObject();
    System.out.println(c.toString()+"\n");
    i++;
   }


   ois.close();
   fis.close();
    }
}

class customer implements Serializable{
    int cusId;
    String name;
    int phoneNum;
    static int num=0;

    customer(){
    }
    
    customer(String name,int phn){
        this.name=name;
        phoneNum=phn;
        cusId=num++;
    }

    public String toString(){
        return "CustomerName "+name+"\nCustomerid "+cusId+"\nphoneNumber "+phoneNum;
    }
}