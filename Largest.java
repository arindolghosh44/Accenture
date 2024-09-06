import java.util.*;
public class Largest{



		public static void main(String [] args){


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size of the array:");
		int num=sc.nextInt();
		int arr[]=new int[num];

		System.out.println("Enter the elements of the array:");
		for(int i=0;i<num;i++){



		arr[i]=sc.nextInt();



		}

		

		System.out.println("The Elements are:"+" ");

		for(int i:arr){

			System.out.print(i+" ");
			

		}
		
		System.out.println();

		//process 1


			/*int maxi=Integer.MIN_VALUE;
			for(int i:arr){
				if(i>maxi)
					maxi=i;

			}

			
			System.out.println(maxi);*/


		//process 2

		
		/*int maxi=Integer.MIN_VALUE;
			for(int i:arr){
				maxi=Math.max(i,maxi);

			}

			
			System.out.println(maxi);*/


		

		

		}













}