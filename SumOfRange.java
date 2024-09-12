import java.io.*;
import java.util.*;
public class SumOfRange{

			int Calculate(int m,int n){

				int sum=0;


			for(int i=m;i<=n;i++){

				if((i%3==0)&& (i%5==0))
					sum+=i;



			}
				

			return sum;

			}
		



		public static void main(String [] args) throws IOException
		{



			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);

			
			System.out.println("Enter the first Number:");


			int a=Integer.parseInt(bf.readLine());



			System.out.println("Enter the Second Number:");


			int b=Integer.parseInt(bf.readLine());


			SumOfRange m=new SumOfRange();


			System.out.println(m.Calculate(a,b));
			
			



		}















}