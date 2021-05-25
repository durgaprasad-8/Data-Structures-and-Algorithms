// traverse the linked list

class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
    
}

public class traversing 
{
    public static void main(String[] args) {

        Node head = new Node(63);
        head.next = new Node(70);
        head.next.next = new Node(79);
        head.next.next.next = new Node(84);
        print_linked_list(head);


        
    }
    
    public static void print_linked_list(Node head) 
    {
        Node current = head;

        while(current != null)
        {
            System.out.print(current.data+ " ");
            current = current.next;
        }

        // while(head != null)
        // {
        //     System.out.print(head.data+ " ");
        //     head = head.next;
        // }
        
    }
}
