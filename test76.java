public class test76 {
    public static void main(String[] args) {
        myArray<String> ma1=new myArray();  //this is like usual Generics no need to worry.The type of object you mention only that object you can take.
                                          //Even in this case also;

        myArray2<Integer> ma2=new myArray2();  //as i have not defined any parameter so we can take object of any type;
        // ma1.setData(10);
        ma1.setData("soumay");
        
        // ma2.setData("osumya");
        ma2.setData(10);  //********this wont be allowed as array2 is set only for String type object as mentioned during extends;
    
        ma1.display();
        System.out.println();
        ma2.display();

    }
}
class myArray<T>{
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

class myArray2<T extends Number> extends myArray<T>{
                                //^-------if i do mention this then even if i dont mention type in main even then i will only be able to take
                                //Object of type T only and 
                                //****VIMP for type T for both Array1 and array2 */;

}
