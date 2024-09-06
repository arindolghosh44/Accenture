import java.io.*;
import java.util.*;
class  ReverseWord{


		static void reverse(String s){

				
			String [] arr=s.split(" ");

			for(int i=arr.length-1;i>=0;i--)

				System.out.print(arr[i]+" ");


		}



		public static void main(String [] args) throws IOException
		{



			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);


			
			System.out.println("Enter the First String:");


			String first=bf.readLine();


			
			




			reverse(first);






		}















}