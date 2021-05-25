
// simple linked list implemention

public class implementation 
{
    static class Node
    {
        int data;

        // self referential class
        Node next;

        // constructor 
        Node(int x)
        {
            data = x;
            next = null;
        }
    }

    public static void main(String[] args) 
    {
        
        // while creating objects, we are passing arguments to the constructor
        // and based on the argument, it generates the output

        Node head = new Node(87);
        Node head2 = new Node(100);
        Node head3 = new Node(109);

        head.next = head2;
        head2.next = head3;

        System.out.println(head.data+ "-->"+ head2.data+ "-->"+ head3.data);

    }
    
}
