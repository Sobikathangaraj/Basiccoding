class Node{
   int data;
   static Node next;
    Node(int i){
        this.data=data;
        this.next=null;
    }
}
public class Singly_LinkedList {

    public static void main(String[] args) {
        Node temp = new Node(20);
        Node.next=new Node(30);
        while(temp !=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
}