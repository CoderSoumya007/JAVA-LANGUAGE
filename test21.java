public class test21 {
    public static void main(String[] args) {
        outer o=new outer();
        // o.display();  //invalid as this method is present inside the inner class which is inside the outer class;
o.i.display();  //OR
outer.inner oi=new outer.inner();  //as the inner class is static hence we can directly access the class using the outer class name;
System.out.println(outer.y);  //static variables can be directly accessed using the class name;
System.out.println(o.y);  //or can allso be referred using the object reference;
System.out.println(o.x);
oi.display();
    }
}

class outer{
    int x=342;
    static int y=93;
    
    public static class inner{  //static inner class;
     public void display(){
        // System.out.println(x);  //non static variables cannot be accessed from inside static class;
        System.out.println("value of y is "+y);
     }
    }
    inner i=new inner();
}