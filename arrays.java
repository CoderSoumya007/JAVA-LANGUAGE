public class arrays {
    public static void main(String[]args){
        // int []marks=new int[10];
        int []marks={34,35,6456,34654,657567,456,456,74,5745,664,65};
        System.out.println(marks.length);
        System.out.println(marks[8]);

        //***printing each elements using "for each" loop;
        for(int elements:marks){
            System.out.println(elements);
        }
    }
}
