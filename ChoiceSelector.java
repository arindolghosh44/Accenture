import java.io.*;
import java.util.*;
public class ChoiceSelector{


		static int OperationChoices(int c , int a ,int b){

			if(c==1)

				return a+b;


			else if(c==2)

				return a-b;



			else if(c==3)

				return a*b;



			else if(c==4)

				return a/b;



			return 0;

		}



		public static void main(String [] args) throws IOException
		{



			InputStreamReader io=new InputStreamReader(System.in);

			BufferedReader bf=new BufferedReader(io);


			
			System.out.println("Enter the Choice Number:");


			int ch=Integer.parseInt(bf.readLine());


			
			System.out.println("Enter the first Number:");


			int a=Integer.parseInt(bf.readLine());



			System.out.println("Enter the Second Number:");


			int b=Integer.parseInt(bf.readLine());



			System.out.println(OperationChoices(ch,a,b));
			



		}















}