class cylinder{
    private int radius;
    private int hieght;

    //getter and settters-->does require when the variables declared are private;
    public void setradius(int radius){
this.radius=radius;
    }public void setheight(int h){
hieght=h;
    }public int getradius(){
return radius;
    }public int getheight(){
return hieght;
    }
    
}
    
    
    
    public class getterAndsetter {
    public static void main(String[]args){
        cylinder mCylinder=new cylinder();
       mCylinder.setradius(34);
       mCylinder.setheight(45);
       System.out.println(mCylinder.getradius());
       System.out.println(mCylinder.getheight());


    }
}
