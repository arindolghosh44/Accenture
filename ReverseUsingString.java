import java.util.*;

public class ReverseUsingString{




		public static void main(String [] args){

		Scanner sc=new Scanner(System.in);

		int num=sc.nextInt();


		//change String to Integer
		String k=Integer.toString(num);

		//String.valueOf(num);
		//String.format(num);

		
		StringBuilder st=new StringBuilder(k);

		st.reverse();
		


		System.out.println(st.toString());









		}
















}