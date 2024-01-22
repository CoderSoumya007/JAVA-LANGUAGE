import java.util.Arrays;
public class test {

	public static void main(String[] args) {
		// java.util.Scanner sc=new java.util.Scanner(System.in);
		// int n=sc.nextInt();
		// int i=10;
		// int newnum=0;
		// while(n!=0){
		// newnum=newnum*i +n%10;
		// n=n/10;
		// }
		// System.out.println("Reverse of the number is "+newnum);

		// char []character={'d','e','t'};
		// System.out.println(Arrays.toString(character));

		// int []arr=new int[5];
		// System.out.println(Arrays.toString(arr));

		
        // *****************INCREASING LENGTH OF AN ARRAY**************************
		int[] A={1,2,3,4,5,6,7,8,9,0};
		System.out.println(A.length);
        int [] B=new int[A.length*2];
		for(int j=0;j<A.length;j++){
			B[j]=A[j];
		}
		A=B;
		System.out.println(A.length);
	
	}

}