import java.util.*;
public class question3{
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
l1.add(0);
l1.add(1);
l1.add(4);
l1.add(3);
l1.add(4);
// 
l1.add(0,94);
l1.add(0,94);

//removing an element;
l1.remove(3);
System.out.println(l1);

//check if an array is present or not!!
System.out.println(l1.contains(1));

//merging two arrayList;
ArrayList<Integer> l2=new ArrayList<>();
l2.add(2);
l2.add(52);
l2.add(264);
l2.add(254);
l1.addAll(l2);
System.out.println(l1);
System.out.println(l2);  //l2 ArrayList remains same;
    }
}
