package com.codewithharry.shape;

public class square extends shape {
square(int side){
super(side,-1,-1);
}
public int volume(){
    return length*length*length;
}
public int surfacearea(){
    return 4*length*length;
}
public static void main(String[] args) {
    square s=new square(5);
    System.out.println("The volume of the square is "+s.volume());
    System.out.println("The surface area of the square is "+s.surfacearea());
}
}
