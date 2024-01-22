import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;


public class comparable {
    public static void main(String[] args) {
        Integer arr[]={4,5,3,8,7,1,9,0};
        Integer ar[][]={{3,2},{1,4},{3,5},{6,9},{7,0}};
        // Arrays.sort(arr); 


        
        Arrays.sort(ar,new MyCmprt());

        //or directly
        // Arrays.sort(ar,(a,b)->Integer.compare(a[1],b[1]));  //soritn in terms of y;

        
    //     for(int x:arr){
    //         System.out.println(x);
    // }
        for(Integer x[]:ar){
            for(int y:x){
                System.out.print(y+ " ");
            }
            System.out.println();
            
        }
        

    
//     LinkedHashSet<Integer> ts=new LinkedHashSet<>();
//     ts.add(4);
//     ts.add(5);
//     ts.add(3);
//     ts.add(8);
//     ts.add(8);
//     Iterator<Integer> it=ts.iterator();
//    while(it.hasNext()){
//     System.out.println(it.next());
//    }
}
}

//Sorting Object of Array using Comparable

// class MyCmp implements Comparable<Integer>{
//     int x;
//     int y;
//     MyCmp(int x,int y){
//         this.x=x;
//         this.y=y;
//     }
    
// }



// ***********Soting 2DArray using Comparator Interface**********************
class MyCmprt implements Comparator<Integer[]>{
    public int compare(Integer x[],Integer y[]){
        return Integer.compare(x[0],y[0]);
    }
}


// ***********Soting Array using Comparator Interface**********************
// class MyCmprt implements Comparator<Integer>{
//     public int compare(Integer x,Integer y){
//         return Integer.compare(x,y);
//     }
// }