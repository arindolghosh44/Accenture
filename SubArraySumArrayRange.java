import java.util.*;
import java.io.*;
public class SubArraySumArrayRange{


		static List<Integer> subarrayRange(int [] arr,int n,int sum){

			List<Integer> list=new ArrayList<>();

			boolean flag=false;

			for(int i=0;i<n;i++){

				int curr=arr[i];

			if(curr==sum){

				list.add(i+1);

				list.add(i+1);

				flag=true;
				break;


			}

			else
				{
					for(int j=i+1;j<n;j++){

						curr+=arr[j];

						if(curr==sum){

							list.add(i+1);

							list.add(j+1);

							flag=true;
								break;

						}

					}
						if(flag)
							break;





				}

					





			}




				if(flag)
						return list;

					list.add(-1);

					return list;








		}





		public static void main(String [] args) throws IOException{



		InputStreamReader io=new InputStreamReader(System.in);

		BufferedReader bf=new BufferedReader(io);
		

		System.out.println("Enter the size of the array:");

		int n=Integer.parseInt(bf.readLine());

		int arr[]=new int[n];

		System.out.println("Enter the Sum :");

		int sum=Integer.parseInt(bf.readLine());

		System.out.println("Enter the array Elements:");

		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(bf.readLine());

		List<Integer>list=subarrayRange(arr,n,sum);


			System.out.println();

			for(int i:list)

				System.out.print(i+" ");

		}
















}