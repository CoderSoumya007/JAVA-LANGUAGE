public class test45 {
    public static void main(String[] args) {
        Atm atm=new Atm();
        customer c=new customer(atm,"soumya",500,90000);
        customer c2=new customer(atm,"shaswat",1000,30000);
        c.start();
        c2.start();
    }
}

class Atm{

   synchronized public void checkBalance(String name){
        System.out.println("Checking Balance of "+name);  //during smith checking balance no one should interfere
                                                         //there shoukd  be no overlapping of usage of ATM;
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    synchronized public void withdrawAmount(String name,int amount){
        System.out.println("Withdrawing Balance");
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("your name is "+name+" Amount has been withdrawn");
    }
}

class customer extends Thread{
    double balance;
  Atm at;
  private String name;
  int withdraw;
  customer(Atm atm,String name,int amt,int bal){
    balance=bal;
    at=atm;
    this.name=name;
    withdraw=amt;
  }
  public void run(){
    at.checkBalance(name);
    at.withdrawAmount(name,withdraw);
  }
}
