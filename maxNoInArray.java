public class maxNoInArray {
    public static void main(String[] args) {
        int i = 0, j = 0, max_marks = 0,counter=0;
        int[] marks = { 34, 456,45654656, 435,98, 54,785, 345,8900};
        for (i = 0; i < marks.length-1; i++) {
            for (j = i + 1; j < marks.length; j++) {
                
                if (marks[i] > marks[j]) {
                    max_marks = marks[i];
                    // System.out.println(max_marks);
                } else {
                    i = j;
                }
                if (j == marks.length-1) {
                    System.out.printf("The max element among the elements is:%d\n", marks[i]);
                    counter=1;
                    break;
                }
            }if(counter==1){
                break;
            }
        }
    }
}
