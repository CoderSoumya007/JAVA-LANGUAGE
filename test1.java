
class test1 {
    public static void main(String[] args) {
String s1="dbjdhdehgbcdjjgadeegdbegehjffie";
String s2="bhjdigif";

           boolean b=false;
                   int temp=Integer.MIN_VALUE;
           for(int i=0;i<s2.length();i++){
               for(int j=0;j<s1.length();j++){
                   if(s2.charAt(i)==s1.charAt(j) && j!=temp && j>=temp){
                       temp=j;
                       b=true;
                       System.out.println("w"+j+ b);
                       break;

                   }
                   b=false;
                   System.out.println("w2 "+j+ b);
                   if(j==s1.length()-1&& s2.charAt(i)!=s1.charAt(j))
                   {
                    System.out.println("r"+j+ b);
                   
                   }
               }if(i<s2.length()-1&&s2.charAt(i)!=s2.charAt(i+1))
               temp=Integer.MIN_VALUE;
           }System.out.println(b);
    }
    }
