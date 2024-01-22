package com.codewithharry.shape;

public class rectangle extends shape{
    rectangle(int length,int breadth,int height){
      super(length,breadth,height);
        }
    
public  int volume(){
    return length*breadth*height;
}
public int surfaceArea(){
    return 4*(length*breadth);
}
public static void main(String[] args) {
    rectangle rec=new rectangle(5,4,6);
    System.out.println("The volume of the rectangle is"+rec.volume());
    System.out.println("The surface area of the rectangle is "+rec.surfaceArea());
}
}

