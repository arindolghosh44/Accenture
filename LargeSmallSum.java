import java.io.*;
import java.util.*;
public class  LargeSmallSum{


		static int largesmallsum(int [] arr, int n){

			if(n<=3)
				return 0;





			
				List<Integer> even=new ArrayList<>();

				List<Integer> odd=new ArrayList<>();

				even.add(arr[0]);


				for(int i=1;i<arr.length;i++){


					if(i%2==0)

						even.add(arr[i]);


					else

						odd.add(arr[i]);


				}


				Collections.sort(even);

				Collections.sort(odd);


			int sum=even.get(even.size()-2)+odd.get(odd.size()-2);


			return sum;





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

			

			System.out.println(largesmallsum(arr,size));




		}















}