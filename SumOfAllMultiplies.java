import java.io.*;
import java.util.*;
public class  SumOfAllMultiplies{


		



		public static void main(String [] args) throws IOException
		{



			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);


			
			System.out.println("Enter the Number:");


			int num=Integer.parseInt(bf.readLine());

			
			int sum=0;

			int value=1;

			for(int i=1;i<=10;i++){

				value=num*i;
				System.out.print(value+" ");

				sum+=value;

				


			}


			System.out.println();
			System.out.println(sum);

		}















}