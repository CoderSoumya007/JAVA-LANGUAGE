import javax.sound.sampled.SourceDataLine;

public class test16 {
    public static void main(String[] args) {
        store s=new store();

        customer c=new customer("soumya",86581);
        customer c1=new customer("shaswat",99375);
        s.register(c);
        s.register(c1);
        s.inviteSale();
        
    }
}

interface member{
    void callback();
}

class store{
    member mem[]=new member[100];
    int count=0;

    void register(member m)
    {
        mem[count++]=m;  //reference of store will point to object of customer;
    }

    void inviteSale(){
    for(int i=0;i<count;i++){
    mem[i].callback();
    // mem[i].callback1(); Not valid as it the method is undefined for the reference(i.e interface).
}
}
}

class customer implements member{
    String name;
    int phoneNumber;
    customer(String name,int phn){
     this.name=name;
     phoneNumber=phn;
    }



public void callback(){
    System.out.println("Ok,I will surely visit for the sale"+name+"\nphn no->"+phoneNumber);
}
public void callback1(){
    System.out.println("Ok,I will not surely visit for the sale"+name+"\nphn no->"+phoneNumber);
}
}
