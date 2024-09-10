import java.io.*;
import java.util.*;
class LastStringlength{


		static int length(String s){

				String x=s.trim();

			int len=0;

			for(int i=0;i<x.length();i++){

				if(x.charAt(i)==' ')
					len=0;

				else
					len++;



			}
			




			return len;

			


		}



		public static void main(String [] args) throws IOException
		{



			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);


			
			System.out.println("Enter the  String:");


			String first=bf.readLine();


			
			

			System.out.println(length(first));






		}















}