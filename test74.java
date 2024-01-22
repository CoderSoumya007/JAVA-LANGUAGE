public class test74 {
    public static void main(String[] args) {
        myArray ma1=new myArray();
        myArray2 ma2=new myArray2();  //as i have not defined any parameter so we can take object of any type;
        ma1.setData(10);
        ma1.setData("soumay");
        
        ma2.setData("osumya");
        // ma2.setData(10);  //********this wont be allowed as array2 is set only for String type object

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

class myArray2 extends myArray<String>{
                                //^-------if i do mention this then even if i dont mention type in main even then i will only be able to take
                                //object of type String only  

}
