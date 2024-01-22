public class pattern6 {
    public static void main(String[] args) {
        int count=1; int x=2;
        for(int i=1;i<=7;i++){
            if(i<=4){
            for(int j=0;j<i;j++){
                System.out.print(count+++"   ");
            }
        }else{
            for(int j=0;j<i-(x);j++){
                System.out.print(count+++"  ");
            }
            x=x+2;
        }
            System.out.println();
        }
    }
}
