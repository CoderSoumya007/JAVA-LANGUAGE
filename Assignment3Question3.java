import java.util.Scanner;

public class Assignment3Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the Student");
        String name=sc.nextLine();
        System.out.println("Enter the marks of the student");
        int mark=sc.nextInt();
        Student s=new Student(name, mark);

        if(mark>100){
            try{
            throw new MarksOutOfBoundException("Marks cant be greater than 100");  //as it is an unchecked exception
            }catch(Exception e){
                System.out.println(e);
            }
        }else{
            System.out.println(name+" has got "+mark);
        }
    }
}

class Student{
    String name ;
    int mark;
    Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }

}

class MarksOutOfBoundException extends Exception{
    public MarksOutOfBoundException(String message){
        super(message);
    }
}