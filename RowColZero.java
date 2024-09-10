import java.util.*;
import java.io.*;

public class RowColZero{

			static void  setZero(int [] [] arr){

				int row=arr.length;

				int col=arr[0].length;


				int rowarr[]=new int [row];

				int colarr[]=new int [col];

				for(int i=0;i<row;i++){
						for(int j=0;j<col;j++){


						if(arr[i][j]==0)
						{
							rowarr[i]=1;
							colarr[i]=1;
						}

				}


				}
			

				
				for(int i=0;i<row;i++){
						for(int j=0;j<col;j++){


						if(rowarr[i]==1 || colarr[j]==1)
						{
							arr[i][j]=0;
						}

				}


				}
			






			
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

			


			

			

			setZero(arr);


			System.out.println("The new Matrix is:");

			for(int i=0;i<row;i++){

				for(int j=0;j<col;j++){

					System.out.print(arr[i][j]+" ");

				}

					System.out.println();
			}

			

		}
















}