import java.io.*;
import java.util.*;
class  DivisorsSum{


		static int Dsum(int n){
			
				int sum=n;

				for(int i=1;i<=n/2;i++)
				{

							if(n%i==0){
					System.out.print(i+" ");
								sum+=i;

				}

				}	

			return sum;
				
		}



		public static void main(String [] args) throws IOException
		{



			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);


			
			System.out.println("Enter the Number:");


			int size=Integer.parseInt(bf.readLine());

			
			System.out.println();
			System.out.println("The sum is"+" "+Dsum(size));






		}















}