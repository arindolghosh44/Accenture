import java.util.*;
import java.io.*;

public class RotateByElement{

			static void RotateByK(int [] arr,int k){

			k=k%arr.length;

			swap(arr,0,arr.length-1);
			swap(arr,0,k-1);
			swap(arr,k,arr.length-1);
			


			}




			static void swap(int [] arr,int start,int end){

			while(start<end){

				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;

				start++;

				end--;

			}



			}







		public static void main(String [] args) throws IOException{

			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);
				
			System.out.println("Enter the size :");
			int size=Integer.parseInt(bf.readLine());


			

			int [] arr=new int[size];


			System.out.println("Enter the elements :");

			for(int i=0;i<size;i++)

				arr[i]=Integer.parseInt(bf.readLine());
			
			
			System.out.println("Enter the kth number :");

			int element=Integer.parseInt(bf.readLine());
			for(int i:arr)

				System.out.print(i+" ");


			System.out.println();

				RotateByK(arr,element);


				System.out.println("After Rotating:");

			for(int i:arr)

				System.out.print(i+" ");

				


		}
















}