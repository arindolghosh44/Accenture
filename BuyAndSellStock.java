import java.io.*;
import java.util.*;
class  BuyAndSellStock{


		static int bestTime(int [] arr, int n){
			
				int mini=Integer.MAX_VALUE;

				int maxi=Integer.MIN_VALUE;

			for(int i=0;i<n;i++)

			{
				mini=Math.min(mini,arr[i]);

				maxi=Math.max(maxi,arr[i]-mini);
				
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

			for(int i:arr)
				System.out.print(i+" ");
			System.out.println();

			System.out.println(bestTime(arr,size));






		}















}