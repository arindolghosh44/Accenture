import java.util.*;
import java.io.*;

public class MaximumSuccessiveDifference{

			static int differeence(int [] arr,int n){


			Arrays.sort(arr);

			int diff=Integer.MIN_VALUE;

			
			if(n<=1)
				return 0;

			
			
			for(int i=1;i<n;i++)


				diff=Math.max(diff,arr[i]-arr[i-1]);



			return diff;



			}







		public static void main(String [] args) throws IOException{

			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);
				
			System.out.println("Enter the size :");
			int size=Integer.parseInt(bf.readLine());


			

			int [] arr=new int[size];


			System.out.println("Enter the elements :");

			for(int i=0;i<size;i++)

				arr[i]=Integer.parseInt(bf.readLine());
			
			
			
			for(int i:arr)

				System.out.print(i+" ");


			System.out.println();

			System.out.println(differeence(arr,size));


		}
















}