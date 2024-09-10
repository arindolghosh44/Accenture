import java.io.*;
import java.util.*;
class NaturalSum{


		static int Nsum(int m){
			if(m==0)
				return m;

			return m+Nsum(m-1);

		}



		public static void main(String [] args) throws IOException
		{



			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);


			
			System.out.println("Enter the Natural Number:");


			int num=Integer.parseInt(bf.readLine());

			
			System.out.println("sum"+" "+"="+Nsum(num));



		}















}