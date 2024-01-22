class pattern7 {
    public static void main(String[] args) {
        romanToInt("MI");
        
    }
    public static void romanToInt(String s) {
        char I=1;
        char V=5;
        char X=10;
        char L=50;
        char C=100;
        char D=500;
        char M=1000;
        // System.out.println(M);
        int sum=0;
        for(int i=0;i<=s.length()-2;i=i+2){
            int n1=s.charAt(i);
            int n2=s.charAt(i+1);
            System.out.println((int)M +" "+ (int)n1);
//             
System.out.println(n1);
        }
    }
}