public class test8 {
    public static void main(String[] args) {
        rectangle r=new rectangle();
        System.out.println(r.getHeight()+""+r.getRadius());
    }
}

class rectangle{
    private int height;
    private int radius;

    public rectangle(){  //default constructor;
        radius=5;
        height=8;
    }

    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius=r;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int r){
        height=r;
    }
    

}