
public class test11 {
   public static void main(String[] args) {
    cylinder c=new cylinder();
   System.out.println(c.area());
   System.out.println(c.volume());
   }
}
class circle{
    public int radius;
    public circle(){
        radius=10;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}

class cylinder extends circle{
    public int height;

    public cylinder(){
        radius=100;
    height=8;
    }

    public double volume(){
     return area()*height;
    }
}