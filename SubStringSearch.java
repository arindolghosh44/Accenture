public class SubStringSearch{

		public static int subStringSeach(String s1,String s2){

			int index=s1.indexOf(s2);

			return index!=-1?index:-1;



		}




		public static void main(String [] args){

			String s1="Hello, World!";
			String s2="World";

			System.out.println(subStringSeach(s1,s2));









		}














}