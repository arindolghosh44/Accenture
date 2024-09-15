import java.util.*;

public class EvenOddSum{


		public static void main(String [] args){


			Scanner sc=new Scanner(System.in);

			int even=0;
			int odd=0;
			int n=sc.nextInt();

			int arr[]=new int[n];


			for(int i=0;i<n;i++)

				arr[i]=sc.nextInt();



			

			for(int i=0;i<n;i++){

				if(i%2==0)

					even+=arr[i];


				else

					odd+=arr[i];
					





			}


			System.out.println(even);

			System.out.println(odd);







		}

















}