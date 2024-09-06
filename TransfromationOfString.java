import java.io.*;
import java.util.*;
class  TransfromationOfString{


		static String Transform(String s){

			char [] arr=s.toCharArray();
			
		for(int i=0;i<arr.length;i++){

			if(arr[i]=='a')

				arr[i]='b';


			else if(arr[i]=='b')

				arr[i]='a';

		}
			


		return new String(arr);

		



		}



		public static void main(String [] args) throws IOException
		{



			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);


			
			System.out.println("Enter the First String:");


			String first=bf.readLine();


			
			




			System.out.println(Transform(first));






		}















}