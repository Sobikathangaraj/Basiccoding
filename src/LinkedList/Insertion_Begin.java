package LinkedList;
import java.util.*;



class Node1
{
    int data;
    Node1 next;
}
public class Insertion_Begin {
    static Node1 head;


    public static void insert(int data)
    {
        Node1 newnode =new Node1();
        newnode.data=data;
        if(head==null)
         head=newnode;
        else {
            newnode.next=head;
            head=newnode;
        }

    }
    public  static void Display()
    {
        Node1 n = head;
        while(n.next!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.print(n.data);
    }

    public static void main(String[] args) {

        Insertion_Begin l = new Insertion_Begin();
        Scanner in= new Scanner(System.in);
        for (int i = 0; i <5; i++) {
            int data=in.nextInt();
            l.insert(data);
        }
        Display();
    }
}
