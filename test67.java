import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class test67 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("c:/Users/soumy/Documents/JAVA LANGUAGE/Serialization2.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        student s=new student("Soumya ranjan panda","CSIT",39,9.6f);
       

        oos.writeObject(s);

        fos.close();
        oos.close();
    }
}

class student implements Serializable{  //***IMPP;-for Serializable the class must implement Serializable keyword; */
    String name;
    int roll;
    String dept;
    float cgpa;
    static int sec;  //Static members of the class wont be serialized (i.e wont be stored in the file);
    transient int group; //Same for transient

    student(){  //************For serialization the serialized class must have a default constructor;
    
    }

    student(String name,String dept,int roll,float f){
        this.name=name;
        this.roll=roll;
        this.dept=dept;
        cgpa=f;
        sec=05;
        group=2241005;
    }
}