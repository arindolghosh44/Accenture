import java.io.*;

public class LinkedList{

	Node head;

	static class Node{


			int data;

			Node next;


		Node(int d){


		data=d;
		next=null;


		}


	}


	public static LinkedList insert(LinkedList list,int data){


		Node new_node=new Node(data);


		if(list.head==null){

			list.head=new_node;


		}
		else{

			Node last=list.head;

			while(last.next!=null){
					last=last.next;

			}
			last.next=new_node;










		}



		return list;




	}


		public static void print(LinkedList list){


			Node curr=list.head;

			while(curr!=null){



				System.out.println("Element:"+" "+curr.data);

			curr=curr.next;



			}










		}

		public static void main(String [] args){


			LinkedList list=new LinkedList();


			list=insert(list,1);

			list=insert(list,2);


			list=insert(list,3);



			list=insert(list,4);





			list=insert(list,5);
			


			print(list);



		}












}