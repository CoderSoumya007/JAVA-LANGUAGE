public class test26 {
   
    public static void main(String[] args) {

        // privateConstructor p=new privateConstructor();  //Not valid as the constructor is Private hence not visible;

        privateConstructor p=privateConstructor.getInstance();  //reference p will refer to the object of the class
        p.fillcoffee(34);
        System.out.println(p.getCoffeeQnty());
        System.out.println(p.getWaterQnty());

        privateConstructor m1=privateConstructor.getInstance();  //Creating object of the privateConstructor but all these 3 are just 
        privateConstructor m2=privateConstructor.getInstance();  //references pointing to the same single object;
        privateConstructor m3=privateConstructor.getInstance();
        
        System.out.println(m1+" "+m2+" "+m3);
        if(m1==m2 && m1==m3)  //all these objects are one only.Only we havae created 3 references to the same object;
            System.out.println("Same");
    }
}
class privateConstructor{
    private float coffeeQnty;
    public float getCoffeeQnty() {
        return coffeeQnty;
    }

    private float waterQnty;

    public float getWaterQnty() {
        return waterQnty;
    }

    private privateConstructor(){  //private constructor object cant be created in that usual way;
        coffeeQnty=1;
        waterQnty=43;
    }

    public void fillcoffee(float qnt){
        coffeeQnty=qnt;
    }
    public void fillwater(float qnt){
        waterQnty=qnt;
    }

    static private privateConstructor my=null;  //Private and static reference so that the static constructor can access it as
                                                // static class can only access staic members;
    
    public static privateConstructor getInstance(){  //New mwthod to create object of private Constructor;Should be public and static
                                                     //as it is a SINGLETON CLASS;i.e can have only limited objects;
    if(my==null){
        my=new privateConstructor();
    }
    return my;
    }
}