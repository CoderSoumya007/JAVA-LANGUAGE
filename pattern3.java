public class pattern3 {
    public static void main(String[] args) {
        // int count=1;
        for(int i=1;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

