package com.codewithharry.shape;

public class sphere extends shape{
    sphere(int radius){
        super(radius,-1,-1);
        }
        public double volume(){
            return (4/3)*Math.PI*length*length*length;
        }
        public double surfacearea(){
            return 4*Math.PI*length*length;
        }
        public static void main(String[] args) {
           sphere sp=new sphere(5);
            System.out.println("The volume of the sphere is "+sp.volume());
            System.out.println("The surface area of the sphere is "+sp.surfacearea());
}
}
