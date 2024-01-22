import java.util.Scanner;

public class Assignment2Question9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Exam arr[]=new Exam[5];
        for(int i=0;i<2;i++){
            arr[i]=new Exam();
            System.out.println("Enter marks of the student");
            int marks1=sc.nextInt();
            int marks2=sc.nextInt();
            int marks3=sc.nextInt();
            System.out.println("Enter roll of the student");
            int roll=sc.nextInt();
            System.out.println("Enter name of the student");
            String name=sc.next();
            System.out.println("Enter the course of the student");
            String course=sc.next1();
        arr[i].input_Marks(marks1,marks2,marks3);
        arr[i].input_Student(roll,name,course);
        arr[i].display_Student();
        arr[i].display_Result();
        }
    }
}

class Student{
    int roll_No;
    String course;
    String name;

    void input_Student(int roll,String name,String course){
        roll_No=roll;
        this.name=name;
        this.course=course;
    }
    void display_Student(){
        System.out.println("The name of the student is "+name);
        System.out.println("The roll number of the student is "+roll_No);
        System.out.println("The course of the student is "+course);
    }
}

class Exam extends Student{
    int mark1;
    int mark2;
    int mark3;
    void input_Marks(int mark1,int mark2,int mark3){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }

    void display_Result(){
System.out.println("marks of student "+name+"are ");
System.out.println(mark1);
System.out.println(mark2);
System.out.println(mark3);
    }
}