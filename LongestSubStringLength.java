import java.io.*;
import java.util.*;
class  LongestSubStringLength{


		static int longestSubString(String s){
			
				
		Set<Character> set=new HashSet<>();

		int maxi=Integer.MIN_VALUE;

		int start=0;

		for(int end=0;end<s.length();end++)
		{

			char c=s.charAt(end);
			while(set.contains(c)){

				set.remove(s.charAt(start));

				start++;


			}

			set.add(c);

			maxi=Math.max(maxi,end-start+1);

		
		
		}

		return maxi;

		}



		public static void main(String [] args) throws IOException
		{



			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);


			
			System.out.println("Enter the String:");


			String s=bf.readLine();

			
			
			

			System.out.println(longestSubString(s));






		}















}