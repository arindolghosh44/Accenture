import java.util.*;
import java.math.*;
public class FactorialNumber{


		public static void Factorial(int n){


			BigInteger fact=BigInteger.ONE;

			for(int i=2;i<=n;i++)
				fact=fact.multiply(BigInteger.valueOf(i));
			

			System.out.println(fact);

		}


		public static void main(String [] args){


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number:");
		int num=sc.nextInt();
		
		
			Factorial(num);
		

		}













}