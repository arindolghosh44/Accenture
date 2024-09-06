import java.io.*;
import java.util.*;
class  Anagram{


		static boolean isAnagram(String s,String t){

				
			if(s.length()!=t.length())
				return false;
			
			char [] st1=s.toCharArray();

			char [] st2=t.toCharArray();
			
			
			Arrays.sort(st1);

			Arrays.sort(st2);

			for(int i=0;i<s.length();i++){

			if(st1[i]!=st2[i])

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


			
			System.out.println("Enter the Second String:");


			String second=bf.readLine();




			System.out.println(isAnagram(first,second));






		}















}