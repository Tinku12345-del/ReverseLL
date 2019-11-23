package Ques;
import java.util.*;
public class Reverse_douLL {
		static Node head;
		static class Node{
			int data;
			Node pre;
			Node next;
			Node(int d)
			{
				data=d;
			}
		}
			public static Reverse_douLL insertion(Reverse_douLL li,int d)
			{
				Node newNode =new Node(d);
				newNode.next=null;
	      		newNode.pre=null;
				if(li.head==null)
				{
					newNode.pre=null;
					li.head=newNode;
				}
				else
				{
					Node temp=li.head;
					while(temp.next!=null)
					{
						temp=temp.next;
					}
					temp.next=newNode;
					newNode.pre=temp;
				}
				return li;
			}
			public static void reverse(Reverse_douLL li)
			{
				Node temp=li.head;
				while(temp.next!=null)
				{
				
					temp=temp.next;
					
				}
				
				
				while(temp.pre!=null)
				{
					
					System.out.print(temp.data+" ");
					temp=temp.pre;
				
				}
				System.out.print(temp.data);
			}
			public static void display(Reverse_douLL li)
			{
				Node temp=li.head;
				
				while(temp.next!=null)
				{
					System.out.print(temp.data+" ");
					temp=temp.next;
				
				}
				System.out.print(temp.data);
				
			}
			public static void main(String args[])
	{
		Reverse_douLL li=new Reverse_douLL();
		Scanner o=new Scanner(System.in);
		System.out.println("Enter size of List");
		int t=o.nextInt();
		System.out.println("Enter elements:");
		for(int i=0;i<t;i++)
		{
			li.insertion(li,o.nextInt());
		}
		System.out.println("Normal LinkedList");
		li.display(li);
		System.out.println("\nReverse LinkedList");
		li.reverse(li);
		
		
	}
	
	
	


}
