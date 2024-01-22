public class recursionPalindrome {
    public  boolean isPalindrome(String s)
    { 
        int left=0,right=s.length()-1;
        String count="";
        if(s.length()==1 || s.length()==0){
            count=count+"3";
            System.out.println(count);
            return true;
        }
       
        if(s.charAt(left)!=s.charAt(right)){
            count=count+"4";
            System.out.println(count);
            return false;
        }
        return isPalindrome(s.substring(left+1,right));
    }public static void main(String[] args) {
            recursionPalindrome palin=new recursionPalindrome();
           System.out.println(palin.isPalindrome("maliyilaM"));
        }
}
