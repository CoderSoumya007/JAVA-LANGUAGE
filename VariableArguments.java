public class VariableArguments {
    public static int sum(int ...marks){
        int result=0;
        for(int ele:marks){
            result+=ele;
        }
        return result;
    }
    public static void main(String[]args){
        System.out.println("The sum of 3 and 5 is "+sum(3,5));  //***These are called as variable arguments;
        System.out.println("The sum of 3 34 343 53 is "+sum(3,34,343,53));
    }
}
