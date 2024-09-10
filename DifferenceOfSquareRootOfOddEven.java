import java.util.*;
import java.io.*;

public class DifferenceOfSquareRootOfOddEven{

			static double squareRootOddEven(int m,int n){


			double evenSum=0,oddsum=0;

			for(int i=m;i<=n;i++){

				double squareRoot=Math.sqrt(i);

				if(i%2==0)

					evenSum+=squareRoot;

				else
					oddsum+=squareRoot;


			}

			return evenSum-oddsum;

			}







		public static void main(String [] args) throws IOException{

			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);
				
			System.out.println("Enter the starting point :");
			int start=Integer.parseInt(bf.readLine());


			

			

			System.out.println("Enter the EndingPoint :");
			int end=Integer.parseInt(bf.readLine());
			
			

			

			double result=squareRootOddEven(start,end);

			System.out.printf("%.5f\n",result);


		}
















}