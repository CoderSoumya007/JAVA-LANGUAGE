public class Assignment2Question7{
    public static void main(String[] args) {
        Employee emp=new Employee("Soumya",20,2246121,100000.0);
        emp.empDisplay();
    }
}

class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}

class Employee extends Person{
    int Eid;
    double salary;
    public Employee(String name,int age,int Eid,double salary){
        super(name,age);
        this.Eid=Eid;
        this.salary=salary;
    }
    void empDisplay(){
        System.out.println("The name of the Employee is "+this.name);
        System.out.println("The age of the Employee is "+this.age);
        System.out.println("The Eid of the Employee is "+this.Eid);
        System.out.println("The salary of the Employee is "+this.salary);
    }
}