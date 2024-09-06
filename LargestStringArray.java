import java.util.*;

//using List and Stream
public class LargestStringArray{




		public static void main(String [] args){

		Scanner sc=new Scanner(System.in);



		List<String> list=new ArrayList<>();

		System.out.println("Enter the size of the list:");

		int num=sc.nextInt();
		

		System.out.println("Enter the Elements of the arrayList:");
		

		for(int i=0;i<=num;i++)
			list.add(sc.nextLine());
		
		for(String i:list)
			System.out.print(i+" ");
		

		System.out.println();

		
		String maxi=list.stream().max(Comparator.comparing(String :: valueOf)).get();
		

		
			




		System.out.println("Largest Element is:"+" "+maxi);

		
		

		

		

		}
















}