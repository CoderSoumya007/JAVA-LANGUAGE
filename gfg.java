public class gfg {
   
  static String delAlternate(String S){
    // code here
    String news="";
    for(int i=0;i<S.length();i++){
       
       news+=S.charAt(i);
        i++;
    }return news;
}
public static void main(String[] args) {
  System.out.println(delAlternate("soumya"));
}
}