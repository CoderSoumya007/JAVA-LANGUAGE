import java.util.*;
interface Emp{
    void display();
    void giveBonus(double amount) throws Exception;
}

abstract class Employee{
    int empid;
    String firstname;
    String lastname;
    double salary;
    
    Employee(int empid,String firstname,String lastname,double salary){
        this.empid=empid;
        this.firstname=firstname;
        this.lastname=lastname;
        this.salary=salary;
    }
}

class Manager   extends Employee implements Emp {
    Manager(int empid,String firstname,String lastname,double salary){
        super(empid,firstname,lastname,salary);
    }
    public void display(){
        System.out.println("The empId of the employee is "+empid);
        System.out.println("The firstName of the employee is "+firstname);
        System.out.println("The lastName of the employee is "+lastname);
    }
    public void giveBonus(double amount) throws Exception{      
        if(amount<0){
            throw new NegativeAmountException("bonus amount cant be negative");
        }else{
            System.out.println("Salary is "+(salary +amount));
        }
    }
}

class NegativeAmountException extends Exception{
    NegativeAmountException(String message){
        super(message);
    }
}

public class AssignmentClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Emp emp[]=new Emp[2];

        for(Emp p:emp){

        System.out.println("Enter empId ,firstName ,Lastname and salary of the Employee");
        int empid=sc.nextInt();
        String firstname=sc.next();
        String lastname=sc.next();
        double salary=sc.nextDouble();

        System.out.println("Enter bonus amount you want to give to employee "+firstname+lastname);
        double amount=sc.nextDouble();
            p=new Manager(empid,firstname,lastname,salary);
            try{
            p.giveBonus(amount);
            }catch(Exception e){
                System.out.println(e);
            }
            p.display();
            System.out.println("---------------------");
        }
    }
}