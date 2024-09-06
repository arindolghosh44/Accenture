import java.util.*;


public class FindTargetElement{

		static int binarySerach(int [] arr,int k){

			int left=0;
			int right=arr.length-1;

			while(left<=right){
				int mid=left+(right-left)/2;
				
				if(arr[mid]==k)

						return mid;

				else if(arr[mid]<k)

					left=mid+1;


				else
					right=mid-1;
				




			}







			return -1;

		}


		public static void main(String [] args){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int num=sc.nextInt();


		int arr[]=new int[num];

		System.out.println("Enter the Elements of the array:");
		

		for(int i=0;i<num;i++)
			arr[i]=sc.nextInt();



		System.out.println("Enter the target element:");
		int target=sc.nextInt();
		
		for(int i:arr)
			System.out.print(i+" ");
		

		System.out.println();

		
		int k=binarySerach(arr,target);

		
		System.out.println("The element found in"+" "+(k+1));

		

		

		}
















}