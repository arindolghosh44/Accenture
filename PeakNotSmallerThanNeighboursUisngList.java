import java.util.*;

public class PeakNotSmallerThanNeighboursUisngList
{

		static List<Integer> FindPeek(int [] arr,int n){

			List<Integer> list=new ArrayList<>();
				if(n==1)
				{
					 list.add(0);
					return list;
				}
			if(arr[0]>=arr[1]){

			
			 list.add(0);

				return list;
			}

			if(arr[n-1]>=arr[n-2])

			{

					 list.add(arr[n-1]);
				return list;
			}

			for(int i=1;i<n-1;i++)

			{
				if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
					list.add(arr[i]);

				

			}
					
				return list;

		}



		public static void main(String [] args){


			Scanner sc=new Scanner(System.in);

			System.out.println("Enter the size:");

			int n=sc.nextInt();


			int arr[]=new int [n];

			System.out.println("Enter the elements:");
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();


			List<Integer> list=FindPeek(arr,n);

			System.out.println();

			for(int i:list)
				System.out.print(i+" ");






		}

















}