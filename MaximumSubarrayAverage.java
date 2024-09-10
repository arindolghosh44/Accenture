import java.io.*;
import java.util.*;
class  MaximumSubarrayAverage{


		static double LengthOfMaxSubarray(int [] arr, int n,int k){
			
			double maxi=Integer.MIN_VALUE;

			double sum=0;
			double avg=0;

			int count=0;

			int start=0;

			for(int i=0;i<n;i++)

			{
				sum+=arr[i];

				count++;

				if(count==k){
					avg=sum/k;

				maxi=Math.max(maxi,avg);
				sum-=arr[start++];
				count--;


				}
				
			}
			
			return maxi;

		}



		public static void main(String [] args) throws IOException
		{



			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);


			
			System.out.println("Enter the array Size:");


			int size=Integer.parseInt(bf.readLine());

			int arr[]=new int[size];
			
			System.out.println("Enter the elements:");

			for(int i=0;i<size;i++)
			 arr[i]=Integer.parseInt(bf.readLine());


			System.out.println("Enter the value of k:");


			int k=Integer.parseInt(bf.readLine());
			

			for(int i:arr)
				System.out.print(i+" ");
			System.out.println();

			System.out.println(LengthOfMaxSubarray(arr,size,k));






		}















}