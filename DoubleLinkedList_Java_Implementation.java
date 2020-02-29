/* Code to Implement Double LinkedList in JAVA  */

public class DoubleLinkedList {
    static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }
    Node head;
    public static DoubleLinkedList insert(DoubleLinkedList l,int d)
    {
        Node temp=new Node(d);
        if(l.head==null)
        {
            l.head=temp;
        }
        else
        {
            Node ptr1=l.head;
            while(ptr1.next!=null)
            {
                ptr1=ptr1.next;
            }
            ptr1.next=temp;
            temp.prev=ptr1;
        }
        return l;
    }
    public static void print(DoubleLinkedList l)
    {
        Node ptr=l.head;
        while(ptr.next!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
    }
    public static void forward(DoubleLinkedList l)
    {
        Node temp=l.head;
        System.out.println("Printing Forward Order");
        while(temp.next!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }
    public static void Reverse(DoubleLinkedList l)
    {
        Node ptr=l.head;
        while(ptr.next!=null)
        {
            ptr=ptr.next;
        }
        System.out.println("Printing Reverse Order");
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.prev;
        }
        System.out.println();
    }
    public static void main(String [] args)
    {
        DoubleLinkedList list=new DoubleLinkedList();
        list=insert(list,1);
        list=insert(list,2);
        list=insert(list,3);
        list=insert(list,4);
        list=insert(list,5);
        list=insert(list,6);
        forward(list);
        Reverse(list);
    }
}
