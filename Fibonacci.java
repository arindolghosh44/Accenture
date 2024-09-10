import java.util.*;
public class Fibonacci{



		public static void FibonacciSeries(int n){


		
		int num1=0,num2=1;

		for(int i=0;i<n;i++){


			System.out.print(num1+" ");


			int num3=num1+num2;

			num1=num2;
			num2=num3;



		}



		/*

			public int fib(int n){

				if(n<=1)
					return n;

				return fib(n-1)+fib(n-2);




			}




		*/










		}










		public static void main(String [] args){


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size of the series:");
		int num=sc.nextInt();
		
		System.out.println();

		FibonacciSeries(num);
		

		}













}