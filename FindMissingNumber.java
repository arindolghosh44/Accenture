import java.io.*;
import java.util.*;
class FindMissingNumber{


		static int missing(int [] arr, int n){

				
			int sum1=(n)*(n+1)/2;
			
			int sum2=0;
			for(int i:arr)

				sum2+=i;



			System.out.println(sum2);



			return sum1-sum2;

			



		}



		public static void main(String [] args) throws IOException
		{



			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);


			
			System.out.println("Enter the size of the array:");


			int n=Integer.parseInt(bf.readLine());


			
			System.out.println("Enter the values:");
				

				int arr[]=new int[n];
				
			for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(bf.readLine());




			System.out.println(missing(arr,n));






		}















}