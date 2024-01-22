public class StringBuilderVSstringbuffer {
    public static void main(String[] args) {
        mydata d=new mydata();
        thread1 t1=new thread1(d);
        thread2 t2=new thread2(d);
        t1.start();
        t2.start();
    }
  
}

class mydata{
    StringBuilder sb=new StringBuilder();
 public  void add(char s){
    sb.append(s);
    System.out.print(s);
   }
}
class thread1 extends Thread{
    mydata data;
thread1(mydata d){
    data =d;
}
public void run(){
    String s="Ranjan";
    for(int i=0;i<s.length();i++){
        data.add(s.charAt(i));
    }
}
}
class thread2 extends Thread{
mydata data;
thread2(mydata d){
    data =d;
}
public void run(){
    String s="Panda";
    for(int i=0;i<s.length();i++){
        data.add(s.charAt(i));
    }
}
}