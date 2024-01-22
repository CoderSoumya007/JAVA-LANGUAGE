import javax.sound.sampled.SourceDataLine;

class circle{
    int radius;
    public void setradius(int i){
this.radius=i;
return;
    }
    public int getradius(){
return radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class cylinder extends circle{
    double height=9;
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class practise52 {
    public static void main(String[]args){
circle obj=new circle();
cylinder obj1=new cylinder();
obj.setradius(55);
obj1.radius=9;

System.out.println(obj.area());
System.out.println(obj1.volume());
    }
}

