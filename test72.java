public class test72 {
    public static void main(String[] args) {
        
        Generic<Integer> gd=new Generic();  // so if no type mention then we can take object of any type(destroys typeSafety);
        // gd.setData("soum");
        gd.setData(10);
        gd.setData(22);

        gd.display();
    }
    
}

class Generic<T>{
     T arr[]=(T[])new Object[3];  //for creating array of object of any type we want;
int i=0;
    public void setData(T obj){
        arr[i++]=obj;
    }
    public void display(){
        for(T x:arr){
            System.out.println(x);
        }
    }
}