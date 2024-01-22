public class test75 {
    public static void main(String[] args) {
        myArray<Integer> ma1=new myArray();  //this is like usual Generics no need to worry.The type of object you mention only that object you can take.

        myArray2<Integer> ma2=new myArray2();
        ma1.setData(10);
        // ma1.setData("soumay");
        
        ma2.setData("osumya");
        // ma2.setData(10);  //********this wont be allowed as array2 is set only for String type object as mentioned during extends;
                              //**********VIMP EVEN IF I HAVE GIVEN INTEGER TYPE IN MAIN MEHTOD*********************/
        // ma2.setData(22.4f);
    
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

class myArray2<T> extends myArray<String>{
                                //^-------if i do mention this then even if i dont mention type in main even then i will only be able to take
                                //object of type String only  
                                //********And IMP even i mention the type in main this extend will override everything so i will only be able to take 
                                //Object of type mentioned HERE(i.e here as written String) */

}
