// delete first node in singly linked list

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




public class del_head 
{

    public static void main(String[] args) 
    {
        Node head = new Node(10);
        head.next = new Node(233);
        head.next.next = new Node(175);
        head.next.next.next = new Node(200);
        head.next.next.next.next = new Node(248);

        print_linked_list(head);

        System.out.println();
        System.out.println("after deleting first element");

        head = delete_head(head);

        print_linked_list(head);
        
    }


    // delete first node

    static Node delete_head(Node head)
    {
        if(head == null)
        {
            return null;
        }

        else
        {
            return head.next;
        }
    }


    // print linked list elements

    static void print_linked_list(Node head)
    {
        Node current4 = head;

        while(current4 != null)
        {
            System.out.print(current4.data+ " ");

            current4 = current4.next;
        }
    }
    
}
