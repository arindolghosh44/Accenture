import java.util.*;
import java.io.*;

public class EquivalentString{


		static boolean equivalent(String [] s1,String [] s2){

			

		StringBuilder str1=new StringBuilder();

		StringBuilder str2=new StringBuilder();


		for(int i=0;i<s1.length;i++)

			str1.append(s1[i]);


		for(int i=0;i<s2.length;i++)

			str2.append(s2[i]);


		if(str1.toString().equals(str2.toString()))
			return true;



		return false;







		}








		public static void main(String [] args) throws IOException{


		InputStreamReader io=new InputStreamReader(System.in);

		BufferedReader bf=new BufferedReader(io);


		System.out.println("Enter the First String array Size:");

		int s1=Integer.parseInt(bf.readLine());
		
		System.out.println("Enter the second String array Size:");

		int s2=Integer.parseInt(bf.readLine());


		System.out.println("Enter the First String array elements:");

		String [] word1=new String[s1];

		String [] word2=new String [s2];

		for(int i=0;i<s1;i++)
			word1[i]=bf.readLine();

			

		System.out.println("Enter the second String array elements:");

		for(int i=0;i<s1;i++)
			word2[i]=bf.readLine();



		System.out.println(equivalent(word1,word2));


		}


















}