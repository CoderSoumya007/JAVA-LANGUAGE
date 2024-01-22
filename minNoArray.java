public class minNoArray {
    
        public static void main(String[] args) {
            int i = 0, j = 0, min_marks = 0,counter=0;
            int[] marks = { 34, 456, 435,98,456,345,10, 54,785, 1};
            for (i = 0; i < marks.length-1; i++) {
                for (j = i + 1; j < marks.length; j++) {

                    
                    if (marks[i] < marks[j]) {
                        min_marks = marks[i];
                        System.out.println(min_marks);
                    } else {
                        i = j;
                    }
                    if (j == marks.length-1) {
                        System.out.printf("The min element among the elements is:%d\n", marks[i]);
                        counter=1;
                        break;
                    }
                }
                if(counter==1){
                    break;
                }
                }
            }
        }
    
    
