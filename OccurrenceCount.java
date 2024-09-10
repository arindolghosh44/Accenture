import java.util.*;
import java.io.*;

public class OccurrenceCount{

			static int OccurenceCountArray(int [] arr,int n,int ele){


			int count=0;

			for(int i:arr){

				if(i==ele)
					count++;


			}





			return count;



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
			
			
			System.out.println("Enter the find occuernce element :");

			int element=Integer.parseInt(bf.readLine());
			for(int i:arr)

				System.out.print(i+" ");


			System.out.println();

			System.out.println(OccurenceCountArray(arr,size,element));


		}
















}