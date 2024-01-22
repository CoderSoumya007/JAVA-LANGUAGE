import java.util.Date;


public class test27 {
    public static void main(String[] args) {
        student s=new student("soumya");
        student s1=new student("soum");
        student s2=new student("so");
        System.out.println(s.getName());
        System.out.println(s.getRollno());
        System.out.println(s1.getRollno());
        System.out.println(s2.getRollno());
    }
}

class student{
    private String name;
    public String getName() {
        return name;
    }

    private String rollno;
    public String getRollno() {
        return rollno;
    }

    private static int count=1;

    student(String name){
     this.name=name;
     rollno=genRollno();
    }

    private String genRollno(){
        Date d=new Date();
    rollno="iter"+(d.getYear()+1900)+"-"+count++;
    return rollno;
    }
}   