import java.io.*;
import java.util.*;
class  MergeSort{


		static int [] mergeSort(int [] arr, int n,int [] arr1,int m){
			int i=0,j=0,k=0;



			Arrays.sort(arr);
			Arrays.sort(arr1);
			int arr2[]=new int[n+m];

			while(i<n && j<m){


				if(arr[i]<arr1[j])
					arr2[k++]=arr[i++];


				else
					arr2[k++]=arr1[j++];

					


			}




			while(i<n){

				arr2[k++]=arr[i++];


			}
				
			while(j<m){

				arr2[k++]=arr1[j++];

			}


			



		return arr2;

		}



		public static void main(String [] args) throws IOException
		{



			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);


			
			System.out.println("Enter the first array Size:");


			int size=Integer.parseInt(bf.readLine());

			int arr[]=new int[size];
			
			System.out.println("Enter the elements:");

			for(int i=0;i<size;i++)
			 arr[i]=Integer.parseInt(bf.readLine());

			System.out.println("Enter the second array Size:");


			int size1=Integer.parseInt(bf.readLine());

			int arr1[]=new int[size1];
			
			System.out.println("Enter the elements:");

			for(int i=0;i<size1;i++)
			 arr1[i]=Integer.parseInt(bf.readLine());


			int [] result=mergeSort(arr,size,arr1,size1);

			for(int i:result)
					System.out.print(i+" ");




		}















}