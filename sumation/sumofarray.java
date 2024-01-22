package sumation;
public class sumofarray {
    public static void main(String[]args){
int [][]marks1={{3,4,5},
                {6,7,8}};
int [][]marks2={{3,6,3},
                {6,4,7}};
int [][]result={{0,0,0},
                {0,0,0}};
for(int i=0;i<marks1.length;i++){
    System.out.print("{ ");
    for(int j=0;j<marks1[i].length;j++){
        result[i][j]=marks1[i][j] +marks2[i][j];
        
        System.out.print(result[i][j]);
        System.out.print(",");
    }System.out.println("}");

}    
}
}  