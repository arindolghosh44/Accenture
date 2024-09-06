import java.util.*;


public class LargestStream{




		public static void main(String [] args){

		Scanner sc=new Scanner(System.in);



		System.out.println("Enter the size of the array:");
		int num=sc.nextInt();


		int arr[]=new int[num];

		System.out.println("Enter the Elements of the array:");
		

		for(int i=0;i<num;i++)
			arr[i]=sc.nextInt();
		
		for(int i:arr)
			System.out.print(i+" ");
		

		System.out.println();

		//Process 1

		/*int maxi=Arrays.stream(arr).max().getAsInt();


		System.out.println("Largest Element is:"+" "+maxi);*/

		
		//Process 2

		Arrays.sort(arr);
		System.out.println("Largest Element is:"+" "+arr[num-1]);




		
		

		

		

		}
















}