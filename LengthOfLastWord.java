import java.util.*;

public class LengthOfLastWord{




		static int length(String s){

			String st=s.trim();

			int count=0;

		for(int i=0;i<st.length();i++){

			if(st.charAt(i)==' ')

				count=0;


			else

				count++;







		}





		return count;



		}







		public static void main(String [] args){


		String st=new Scanner(System.in).nextLine();




		System.out.println(length(st));







		}


















}