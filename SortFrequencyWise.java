import java.io.*;
import java.util.*;
class  SortFrequencyWise{


		static String FrequencySorting(String s){
			
				Map<Character,Integer> map=new HashMap<>();

				StringBuilder sb=new StringBuilder();

				for(int i=0;i<s.length();i++)
					map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);




		PriorityQueue<Map.Entry<Character,Integer>>maxheap=new PriorityQueue<>((n1,n2)->n2.getValue()-n1.getValue());


		maxheap.addAll(map.entrySet());
		while(!maxheap.isEmpty()){


		Map.Entry<Character,Integer>e=maxheap.poll();

		int count=e.getValue();

		char c=e.getKey();


		for(int i=0;i<count;i++)

			sb.append(c);





		}

			return sb.toString();
		
		

		}



		public static void main(String [] args) throws IOException
		{



			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);


			
			System.out.println("Enter the String:");


			String s=bf.readLine();

			
			
			

			System.out.println(FrequencySorting(s));






		}















}