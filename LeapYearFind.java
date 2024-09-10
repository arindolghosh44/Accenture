import java.io.*;
import java.util.*;
class  LeapYearFind{


		static boolean LeapYear( int n){
			if(n%400==0)
				return true;


			else if(n%4==0 && n%100!=0)
				return true;


			return false;
				

		}



		public static void main(String [] args) throws IOException
		{



			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);


			
			System.out.println("Enter the Year:");


			int year=Integer.parseInt(bf.readLine());

			
			System.out.println(LeapYear(year));



		}















}