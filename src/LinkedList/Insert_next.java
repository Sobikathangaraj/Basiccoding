package LinkedList;

import java.util.Scanner;

class Node
 {
     int data;
     Node next;
 }

public class Insert_next {
  static Node head;
    public static void insert(int data)
    {

        Node newnode = new Node();
        newnode.data=data;
        if(head==null) head=newnode;
        else
        {
            Node temp=head;
            if(temp!=null) temp.next=newnode;
        }
    }
    public static void Display()

    {
        Node n=head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
    }

    public static void main(String[] args) {
        Insert_next l = new Insert_next();
        Scanner in = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            int data= in.nextInt();
            l.insert(data);
        }
        Display();
    }
 }
