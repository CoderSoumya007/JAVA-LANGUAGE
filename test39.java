public class test39 {
    public static void main(String[] args) {
       Stack s=new Stack(5);
       try{
        s.add(43);
        s.add(434);
        s.add(465);
        s.add(465);
        // s.add(465);
       System.out.println(s.pop(1));
       }catch(stackOverflowException e){
        System.out.println(e);
       }
       catch(stackUnderFlowException a){
        System.out.println(a);
       }
    }
}
class stackOverflowException extends Exception{
    public String  toString(){
        return "Stack OverFlow";
    } 
}
class stackUnderFlowException extends Exception{
    public String toString(){
        return "Stack UnderFlow";
    }
}
class Stack {
    private int size;
    private int top;
    private int arr[];

    public Stack(int size){
    this.size=size;
    arr=new int[size];
    }


    public void add(int a) throws  stackOverflowException{
        if(top==size-1){
            throw new stackOverflowException();
        }
        arr[top]=a;
        top++;
    }
    
    public int pop(int a) throws stackUnderFlowException{
        int x=-1;
        if(top==-1){
            throw new stackUnderFlowException();
        }
        x=arr[a];
        top--;
return x;
    }
}