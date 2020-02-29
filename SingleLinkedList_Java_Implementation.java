/* Code to Implement Single LinkedList in JAVA  */

public class LinkedList {
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    Node head;
    public static LinkedList insert(LinkedList l,int data)
    {
        Node temp=new Node(data);
        if(l.head==null)
        {
            l.head=temp;
        }
        else
        {
            Node leaf=l.head;
            while(leaf.next!=null)
            {
                leaf=leaf.next;
            }
            leaf.next=temp;
        }
        return l;
    }
    public static void print(LinkedList list)
    {
        Node ptr=list.head;
        while(ptr.next!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
        System.out.println(ptr.data);
    }
    public static void main(String [] args)
    {
        LinkedList list=new LinkedList();
        list=insert(list,1);
        list=insert(list,2);
        list=insert(list,3);
        list=insert(list,4);
        list=insert(list,5);
        list=insert(list,6);
        print(list);
    }
}

