import java.io.*;
import java.util.*;
public class PalindromeString{


		static boolean PalindromCheck(String s){

				int len=s.length();

			for(int i=0;i<len/2;i++)
				{
					if(s.charAt(i)!=s.charAt(len-i-1))
						return false;

				}
		

				return true;

		}



		public static void main(String [] args) throws IOException
		{



			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);


			
			System.out.println("Enter the First String:");


			String first=bf.readLine();


			



			if(PalindromCheck(first))
					System.out.println("1");

			else
				System.out.println("0");



		}















}