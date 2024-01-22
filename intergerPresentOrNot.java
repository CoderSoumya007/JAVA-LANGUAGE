public class intergerPresentOrNot {
    public static void main(String[]args){
        int j=0;
        int []marks={34,545,3445,34,45,34,34};
        for(int i=0;i<marks.length;i++){
            if(marks[i]==34){
                System.out.println("The given integer is present in the array");
                j=1;
                break;
            }
                else{
                    // System.out.println("The given integer is absent in the array");
                }
            }if(j==0){
                System.out.println("The given element is not presnt in the array");
            }
        }
    }

