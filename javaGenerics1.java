public class javaGenerics1 {
    public static void main(String[] args) {
        Data<String> d=new Data();
        d.setdata("hi");
        d.setdata("d");
        System.out.println(d.getdata());
    }
}

class Data<T>{
    private T obj;
    public T getdata(){
        return obj;
    }
    public void setdata(T v){
        obj=v;
    }
}