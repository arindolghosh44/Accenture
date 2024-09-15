import java.util.*;

public class MaxMinUsing 
{


		public static void main(String [] args){


			List<Integer> list=Arrays.asList(-9,-18,0,25,4);

			Integer var=list.stream().max(Integer::compare).get();

			Integer var1=list.stream().min(Integer::compare).get();

			System.out.println(var);

			
			System.out.println(var1);












		}

















}