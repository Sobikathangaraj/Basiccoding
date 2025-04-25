package LinkedList;

import java.util.Scanner;

class Node3
{
    int data;
    Node3 next;
}
public class Deletion {
    static Node3 head;
    public static void delete(int position)
    {
        Node3 n =head;

        if(position==1)
        {
            head=n.next;
        }
        for(int i=1;i<position-1;i++)       //   2
        {
            if(n==null||n.next==null)  return;
            n = n.next;
        }
        if(position>4||position<=0) {
            System.out.println("Enter valid Position");
            return;
        }
       Node3 n1= n.next;
        n.next=n1.next;
        n1=null;         // Bring to garbage

    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a 4 elements:");
        for(int i=0;i<4;i++)
        {
            int data=in.nextInt();
            insert_next(data);
        }
        System.out.println("Enter position to delete:");
        int position=in.nextInt();
        delete(position);
        show();
    }
    public static void insert_next(int data)
    {
        Node3 node=new Node3();
        node.data=data;
        node.next=null;
        if(head==null)
        {
            head=node;
            return;
        }
        Node3 temp=head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next=node;

    }
    public static void show()
    {
        Node3 temp=head;
        System.out.println("Updated Deleted data:");
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        System.out.println();
    }
}


