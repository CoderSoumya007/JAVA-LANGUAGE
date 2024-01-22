package com.codewithharry.shape;

public class circle extends shape{
    circle(int radius){
        super(radius,-1,-1);
        }
        public double volume(){
            return 0.00;
        }
        public double surfacearea(){
            return Math.PI*length*length;
        }
        public static void main(String[] args) {
           circle c=new circle(5);
            System.out.println("The volume of the circle is "+c.volume());
            System.out.println("The surface area of the circle is "+c.surfacearea());
}
}
