import java.util.*;

//Kadane's algorothm
public class MaximumSumSubarray{




		public static void main(String [] args){

		Scanner sc=new Scanner(System.in);
		int sum=0;

		int maxi=Integer.MIN_VALUE;
		System.out.println("Enter the size of the array:");
		int num=sc.nextInt();


		int arr[]=new int[num];

		System.out.println("Enter the Elements of the array:");
		

		for(int i=0;i<num;i++)
			arr[i]=sc.nextInt();
		
		for(int i:arr)
			System.out.print(i+" ");
		

		System.out.println();

		
		for(int i:arr){

			sum+=i;
			

		maxi=Math.max(maxi,sum);
		if(sum<0)
			sum=0;



		}



		System.out.println("Maximum subarray SUM is:"+" "+maxi);

		
		

		

		

		}
















}