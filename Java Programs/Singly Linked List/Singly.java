import java.util.*;
public class Singly  {
	class node
	{
        int data;
        node next;
        public node(int data)
        {
            this.data=data;
            this.next=null;
        }
	}
	public node head=null;
	public node tail=null;
	public void addnode(int data)
	{
        node newnode=new node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            tail.next=newnode;
            tail=newnode;
        }
	}
	public void remove(int data)
	{
        if(head==null)
        {
            System.out.println("list is empty");
        }
        else
        {
            node current=head;
            node current2=head;
            while(current.data!=data)
            {
                current=current.next;
            }
            while(current2.data==data)
            {
                current2=current2.next;
            }
            current.next=current2.next;
            current2.next=null;
        }
    }
	public void display()
	{
        node current=head;
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        System.out.println("nodes of the list");
        while(current!=null)
        {
            System.out.println(current.data+" ");
            current=current.next;
        }
        System.out.println();
	}
	public static void main(String[] args)
	{
        Singly s=new Singly();
        s.addnode(1);
        s.addnode(2);
        s.addnode(3);
        s.display();
        s.remove(2);
        s.display();
	}
}
