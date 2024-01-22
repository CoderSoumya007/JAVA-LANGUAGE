public class test73 {
    public static void main(String[] args) {
        multipleParameter<String,Integer> mp=new multipleParameter();
        mp.set("soumya",39);
       System.out.println(mp.showValue());
    }
}

class multipleParameter<K,V>{
    K key;
    V value;
    int i=0;
    public void set(K key,V value){
        this.key=key;
        this.value=value;
    }

    public V showValue()
    {
        return value;
    }
}