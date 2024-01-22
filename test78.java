public class test78 {
    public static void main(String[] args) {
        MyArray<Float> maa=new MyArray();
        // maa.append("Soumya");
        // maa.append("ranjan");
        // maa.append("panda");
        maa.append(1f);
        maa.append(1.3f);

        // maa.display();
        show(maa);
    }

    public static void show(MyArray<? extends Number> obj){ //now objects of class extending Number class can only be sent as an argument.
        obj.display();                        //^---------------|  //wild card
    }
}


class A{}
class B extends A{}
interface C{}
class MyArray<T extends Number>{
    T arr[]=(T[])new Number[4];  //*********VIMP it should not be Object or else it will throw Exception.As Number cannot have a reference of parent class; */
    int i=0;

    public void append(T v){
        arr[i++]=v;
    }

    public void display(){
        for(T x:arr){
            System.out.println(x);
        }
    }
}