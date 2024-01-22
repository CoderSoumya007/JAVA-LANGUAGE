public class test70 {
    
    
    public static void main(String[] args) {
        GenericDemo<Integer> gd=new GenericDemo<>();

        gd.setData(10);
        gd.setData(20);
        // gd.setData("soumya");  //As Generics is defined for type integer it cannot be anything else;

        System.out.println(gd.getData());

       
    }
}

class GenericDemo<T>{ //must be declared with the parameter for defining generics
    

    T v;
    public void setData(T obj){
        v=obj;
    }

    public T getData(){
        return v;
    }

     
}

