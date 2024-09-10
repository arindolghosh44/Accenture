import java.io.*;
import java.util.*;
class  RearrangeArrayElementBySign{


		static int[] Rearrange(int [] arr, int n){
			
				List<Integer> posi=new ArrayList<>();

				List<Integer> negi=new ArrayList<>();



				for(int i:arr){

					if(i>0)
						posi.add(i);

				}
				


				for(int i:arr){

					if(i<0)
						negi.add(i);

				}

				int arr1[]=new int[n];

				int k=0;
				int c=0;


				while(c<posi.size()){



					arr1[k]=posi.get(c);
					arr1[k+1]=negi.get(c);

					
					k+=2;
					c++;




				}


				return arr1;
			

		}



		public static void main(String [] args) throws IOException
		{



			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);


			
			System.out.println("Enter the array Size:");


			int size=Integer.parseInt(bf.readLine());

			int arr[]=new int[size];
			
			System.out.println("Enter the elements:");

			for(int i=0;i<size;i++)
			 arr[i]=Integer.parseInt(bf.readLine());

			for(int i:arr)
				System.out.print(i+" ");
			System.out.println();

			int arr1[]=Rearrange(arr,size);

			for(int i:arr1)

				System.out.print(i+" ");




		}















}