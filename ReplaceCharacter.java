import java.util.*;
import java.io.*;
public class  ReplaceCharacter{


		static void replaceChar(String s,char ch1,char ch2){


		String k="";

		for(int i=0;i<s.length();i++){

			if(s.charAt(i)==ch1)

				k=k+ch2;


			else if(s.charAt(i)==ch2)

				k=k+ch1;

			else
				k=k+s.charAt(i);




		}

				
			System.out.println(k);


		}



		public static void main(String [] args) throws IOException
		{



		//Using Scanner Class 
		Scanner sc=new Scanner(System.in);

		String str=sc.next();

		char ch1=sc.next().charAt(0);

		char ch2=sc.next().charAt(0);


		//using Buffered Reader Class
		/*

		InputStreamReader io=new InputStreamReader(System.in);

		BufferedReader bf=new BufferedReader(io);
		
		//ReadLine only for String
		String str=bf.readLine();

		char ch1=bf.readLine().charAt(0);

		char ch2=bf.readLine().charAt(0);*/

		replaceChar(str,ch1,ch2);


		}















}