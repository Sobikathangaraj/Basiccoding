package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

class Node2
{
    int data;
    Node2 next;
}

public class Insert_position {
   static  Node2 head;
    public static void insert(int position,int data)
    {

        Node2 newnode = new Node2();
        newnode.data = data;
        if(position==0||head==null)                                           // NEW ONEE---
        {
            newnode.next=head;
            head = newnode;
            return;
        }
        Node2 n = head;
        for(int i=0;i<position-1;i++)  //2
            {
              n=n.next;
           }
          newnode.next=n.next;
          n.next=newnode;
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
        System.out.println("Enter data: "+" "+"Enter position to insert:");
        int data=in.nextInt();
        int position=in.nextInt();
        insert(position,data);
        show();
    }
    public static void insert_next(int data)
    {
        Node2 node=new Node2();
        node.data=data;
        node.next=null;
        if(head==null)
        {
            head=node;
            return;
        }
        Node2 temp=head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next=node;

    }
    public static void show()
    {
        Node2 temp=head;
        System.out.println(" Updated Inserted data:");
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        System.out.println();
    }
}
