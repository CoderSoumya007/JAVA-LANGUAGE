public class test71 {
    public static void main(String[] args) {
        GenericDemo1<String> gd=new GenericDemo1<String>();
        gd.setData("soumya ");
        gd.setData("Ranjan ");
        gd.setData("Panda");

        gd.display();
       
    }
}
class GenericDemo1<T>{
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
