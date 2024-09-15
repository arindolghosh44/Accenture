import java.util.*;

public class PeakNotSmallerThanNeighbours
{

		static int FindPeek(int [] arr,int n){
				if(n==1)
					return 0;

			if(arr[0]>=arr[1])
					return 0;

			if(arr[n-1]>=arr[n-2])
					return n-1;

			for(int i=1;i<n-1;i++)

			{
				if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
					return i;

				

			}
					
				return 0;

		}



		public static void main(String [] args){


			Scanner sc=new Scanner(System.in);

			int n=sc.nextInt();


			int arr[]=new int [n];


			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();


			System.out.println(FindPeek(arr,n));








		}

















}