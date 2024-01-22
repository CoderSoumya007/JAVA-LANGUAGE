public class test12 {
    public static void main(String[] args) {
       SavingsAccount a=new SavingsAccount(128260, "Soumya Ranjan Panda","08-09-2003");
        System.out.println(a.balance);
        a.deposit(18000);
        System.out.println(a.balance);
        System.out.println(a.withdraw(590));
        System.out.println(a.fixedDeposit(1000));
        System.out.println(a.balance);
        
    }
}

class Account{
    private int AccNo;
    private String Name;
    private String Address;
    private int phoneNumber;
    private String dob;
    protected double balance;
    protected double fd;

    public Account(int accNo,String name,String dob){
     AccNo=accNo;
     Name=name;
     this.dob=dob;
     balance=0.0;
     fd=0.0;
    }
    public int getAccNo() {
        return AccNo;
    }
    public String getName() {
        return Name;
    }
    public String getAddress() {
        return Address;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getDob() {
        return dob;
    }
    public double getBalance() {
        return balance;
    }

    public void setAddress(String Address){
    this.Address=Address;
    }
    public void setPhoneNumber(int phn){
        this.phoneNumber=phn;
    }
    
    public double showBalace(){
        return balance;
    }
    public void close(){
        System.out.println("Your Account will be permanently Closed");
    }
}

class SavingsAccount extends Account{

    public SavingsAccount(int accNo, String name, String dob) {
        super(accNo, name, dob);
        
    }
  public void deposit(int money){
    balance+=money;
  }
  public double withdraw(int money){
    balance-=money;
    return balance;
  }
  public double fixedDeposit(int money){
    balance-=money;
    return fd+=money;
  }
  
}