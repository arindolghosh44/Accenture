import java.io.*;
import java.util.*;
class  PalindromString{


		static boolean isPalindrom(String s){

				//process 1
			/*String k=s;
			StringBuilder st=new StringBuilder(s);

			st.reverse();

			if(k.equals(st.toString())){

					return true;

			}

			return false;*/

			//Process 2  Two pointer

			int left=0;

			int 	right=s.length()-1;
			

				while(left<right){
			if(s.charAt(left)!=s.charAt(right))
					return false;

			left++;
			right--;
			}


			return true;

		}



		public static void main(String [] args) throws IOException
		{



			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);


			
			System.out.println("Enter the First String:");


			String first=bf.readLine();


			
			



			System.out.println(isPalindrom(first));






		}















}