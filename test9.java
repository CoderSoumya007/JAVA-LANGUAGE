public class test9 {
    public static void main(String[] args) {
        student st[]=new student[5];  //Creating Array of objects;
        st[0]=new student(39,"soumya","CSIT");
        st[1]=new student(40,"Shaswat","CSIT");
        st[2]=new student(51,"Aman","CS");
        st[3]=new student(52,"Bharat","CS");
        st[4]=new student(53,"Sumeiya","CSIT");
        
       student s=new student();  //Creating a new object of class student;
       s.setSubjects("\ndiscrete Mathematics","Introduction to Computer Language","Calculus","University physics Machanics","Communication and Critical Thinking");

        for(student e:st){  //Printing each object in form of String;
           System.out.println(e);
        }

        s.print(); //Printing the Subjects;
    }
}

class student{
    private int rollNo;
    private String name;
    private String dept;
    private String[] subjects;  //setters only needed for subjects;Rest will be initialised during object creation.

    public student(int rollNo,String name,String dept){  //Parameterized constructor initializing name,RollNo.,and Department;
    this.rollNo=rollNo;
    this.name=name;
    this.dept=dept;
    }

    public student(){}  //Creating a default Constructor so that we can create a new object of this Clss;
    
    //**************Getter Methods ***************//
    public int getRollNo() {
        return rollNo;
    }
   
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
   
    public String[] getSubjects() {
        return subjects;
    }

 //***********************Setter Methods*********/
    public void setSubjects(String ...subjects) {  //using Variable Arguments Concept;
        this.subjects = subjects;
    }
 
    ///************************Important Method to return the objects that are created in Array form******** */
    public String toString(){ 
       return "\nrollNo-"+rollNo+"\nName->"+name+"\ndept->"+dept+"\nsubjects->"+subjects;
       
    }

    public void print(){    ///Print Method to print the subjects;
        for(String subs:subjects)
        System.out.println(subs);
    }
    
   

    
}
