public class productArray {
    public String reverse(String str)
    {
        int n=str.length();
       if(n==1){
        return str;
       }n--;
        return (str.charAt(n))+reverse(str.substring(0,n));
    }
    public static void main(String[] args) {
        productArray pa=new productArray();
        String name=pa.reverse("soumya");
        System.out.println(name);
    }
}
