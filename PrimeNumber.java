import java.util.*;


public class PrimeNumber{

		static boolean isPrime(int k){

			if(k<=1)
				return false;

			for(int i=2;i<=Math.sqrt(k);i++){

				if(k%i==0)
					return false;


			}








			return true;

		}


		public static void main(String [] args){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int num=sc.nextInt();


		int arr[]=new int[num];

		System.out.println("Enter the Elements of the array:");
		

		for(int i=0;i<num;i++)
			arr[i]=sc.nextInt();
		
		for(int i:arr)
			System.out.print(i+" ");
		

		System.out.println();

		
		List<Integer> list=new ArrayList<>();


		for(int i:arr){

			if(isPrime(i))
				list.add(i);


		}


		for(int i:list)
		System.out.print(i+" ");

		
		

		

		

		}
















}