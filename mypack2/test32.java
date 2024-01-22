package mypack2;

import mypack1.test28;

public class test32 extends test28{  //This is a non-sub class in different package;
    void show(){
        test28 ttt=new test28();
    ttt.display();
    System.out.println(ttt.a+ttt.b+ttt.c+ttt.d);

    }
    
}
