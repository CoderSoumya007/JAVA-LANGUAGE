import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;


public class StudentChallenge {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        HashMap<String,Account> hm=new HashMap<>();
        Account ac=null;

        
        try{
            FileInputStream fis=new FileInputStream("c:/Users/soumy/Documents/JAVA%20LANGUAGE/BankAccount.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);

            int length=ois.readInt();  //to read the number of objects present in the file

            for(int i=0;i<length;i++){
                ac=(Account)ois.readObject();
                hm.put(ac.AccNO, ac);
            }
            ois.close();
            fis.close();
        }catch(Exception e){
            
        }
        String accNo;
        String name;
        Float balance;
        while(true){
            System.out.println("Enter 1 to Create Account");
            System.out.println("Enter 2 to Delete Account");
            System.out.println("Enter 3 to view a Account");
            System.out.println("Enter 4 to view All Accounts");
            System.out.println("Enter 5 to Save All Accounts");
            System.out.println("Enter 6 to Exit");
            int choice;
            choice=sc.nextInt();

            switch (choice) {
                case 1:
                System.out.println("Enter your Name and Balance you want to store in your Account");
                name=sc.next();
                balance=sc.nextFloat();

                   ac=new Account(name,balance);

                    hm.put(ac.AccNO,ac);
                    System.out.println("Account Successfully Created");
                    break;
                case 2:
                System.out.println("Enter your Account Number");
                accNo=sc.next();
                if(hm.containsKey(accNo)==true){
                    hm.remove(accNo);
                    System.out.println("Account Successfully Deleted");
                }else{
                    System.out.println("Account not Fount");
                }
                break;
                case 3:
                System.out.println("Enter your Account Number");
                accNo=sc.next();
                ac=hm.get(accNo);
                System.out.println(ac);
                break;
                case 4:
                for(Account x:hm.values()){
                    System.out.println(x);
                }
                break;
                case 5:
                FileOutputStream fos=new FileOutputStream("c:/Users/soumy/Documents/JAVA LANGUAGE/BankAccount.txt");
                ObjectOutputStream oos=new ObjectOutputStream(fos);

                oos.writeInt(hm.size());  //always first store the number of elements you are storing;
                for(Account x:hm.values()){
                    oos.writeObject(x);
                }

                oos.flush();
                oos.close();
                fos.close();

                System.out.println("Accounts saved Succussfully");
                break;
                case 6:System.exit(0);
                break;
                default:
                System.out.println("Enter valid choice");
                    break;
            }
        }
        
    }
}
class Account implements Serializable{
    String AccNO;
    String Name;
    Float Balance;

    static int i=0;

    Account(){}  //for serializable class must have default constructor;

    Account(String Name,Float Balance){
        this.AccNO="ubin"+i++;
        this.Name=Name;
        this.Balance=Balance;

    }

    public String toString(){
        return "Account Number:-"+AccNO+"\nName:-"+Name+"\nBalance:-"+Balance;
    }
    
}
