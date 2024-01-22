package com.codewithharry.shape;

public class cylinder extends shape{
    cylinder(int radius,int height){
        super(radius,-1,height);
        }
        public double volume(){
            return Math.PI*length*length*height;
        }
        public double surfacearea(){
            return (2*Math.PI*length*length)+(2*Math.PI*length*height);
        }
        public static void main(String[] args) {
           cylinder cy=new cylinder(5,8);
            System.out.println("The volume of the cylinder is "+cy.volume());
            System.out.println("The surface area of the cylinder is "+cy.surfacearea());
}
}