public class test19 {
    public static void main(String[] args) {
        outer o=new outer();
        // o.innerdisp();  //not valid 
        o.outerdisp();
        // outer.inner oi=new outer().new inner();  //not valid as the inner class is inside a method of outer class ;

    }
}

class outer{
void outerdisp(){
int x=45;

 class inner{  //*********IMP-Mehtod local inner class can only be abstract or final.public or static is not allowed */
        void innerdisp(){
            System.out.println("inner disp");
        }
    }


inner i=new inner();  //to access inner class we need to create its object first
i.innerdisp();

// }inner i=new inner();  //can only be accessed within the method locally;
}
}