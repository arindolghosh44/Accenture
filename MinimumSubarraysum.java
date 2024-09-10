import java.io.*;
import java.util.*;
class  MinimumSubarraysum{


		static int LengthOfMinSubarray(int [] arr, int n,int target){
			
			int mini=Integer.MAX_VALUE;

			int sum=0;
		
			

			int start=0;

			for(int i=0;i<n;i++)

			{
				sum+=arr[i];

				

				while(sum>=target){
					
					sum-=arr[start];
				mini=Math.min(mini,i-start+1);
				
				start++;


				}
				
			}

			if(mini==Integer.MAX_VALUE)
				return 0;
			
			return mini;

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


			System.out.println("Enter the value of target:");


			int k=Integer.parseInt(bf.readLine());
			

			for(int i:arr)
				System.out.print(i+" ");
			System.out.println();

			System.out.println(LengthOfMinSubarray(arr,size,k));






		}















}