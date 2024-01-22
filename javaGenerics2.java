public class javaGenerics2 {
    public static void main(String[] args) {
        Myarray<Integer> ma=new Myarray();
        ma.append(3);
        ma.append(3);
        ma.append(3);
        ma.display();
    }
}

class Myarray<T>{

    T arr[]=(T[])new Object[10]; //important

    int length=0;
    public void append(T obj){
        arr[length++]=obj;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
    }
}