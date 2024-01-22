public class test50 {
    public static void main(String[] args) {
        dept d=dept.ece;
        System.out.println(d.ordinal());  //returns the index of the identifiers;
        System.out.println(d.name());     //returns the name of the object;
        
        d.display();    
        d.getheadname();
        d.getdept();    

        dept list[]=dept.values();
        for(dept x:list){
         System.out.println(x);
        }
    }
}

enum dept{
    cs("soumya","ranjan"),it("soumya1","ranjan1"),ece("soumay2","ranjan2");  //parameters must be same as constructor arguments;
  String head;
  String dept;
    private dept(String headname,String deptname){
//   System.out.println("constructor call "+ this.name());
   this.head=headname;
   this.dept=deptname;

  }
  public void getheadname(){
    System.out.println(head);
  }

  public void getdept(){
    System.out.println(dept);
  }
  public void display(){
    System.out.println("display "+this.name()+" "+this.ordinal());
  }
}