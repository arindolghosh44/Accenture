import java.util.*;
import java.io.*;

public class SerachMatrix{

			static boolean search(int [] [] arr,int ele){

				int row=arr.length;

				int col=arr[0].length;


				int low=0;


				int high=row*col-1;


				while(low<=high){



					int mid=(low+high)/2;

					
					if(arr[mid/col][mid%col]==ele)
						return true;

					else if(arr[mid/col][mid%col]<ele)

						low=mid+1;

					else
						high=mid-1;

					






				}

				return false;









			
			}







		public static void main(String [] args) throws IOException{

			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);
				
			System.out.println("Enter the row :");
			int row=Integer.parseInt(bf.readLine());


			System.out.println("Enter the column :");
			int col=Integer.parseInt(bf.readLine());
			
			int [][] arr=new int[row][col];

			System.out.println("Enter the values:");



			for(int i=0;i<row;i++)

				for(int j=0;j<col;j++)

					arr[i][j]=Integer.parseInt(bf.readLine());


			

			for(int i=0;i<row;i++){

				for(int j=0;j<col;j++){

					System.out.print(arr[i][j]+" ");

				}

					System.out.println();
			}

			


			System.out.println("Enter the Searching element:");
			int ele=Integer.parseInt(bf.readLine());

			

			System.out.println(search(arr,ele));

		}
















}