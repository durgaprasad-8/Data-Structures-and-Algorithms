
// delete last element in linked list


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



public class del_tail 
{
    public static void main(String[] args) 
    
    {
        Node head = new Node(18);

        head.next = new Node(133);
        head.next.next = new Node(128);
        head.next.next = new Node(183);
        head.next.next.next = new Node(254);
        head.next.next.next.next = new Node(1);

        // error
        // Node node2 = new Node(133);
        // Node node3 = new Node(128);
        // Node node4 = new Node(183);
        // Node node5 = new Node(1);
        
        print_linked_list(head);
        
        System.out.println();
        System.out.println("after deleting tail element");

        head = delete_tail(head);

        print_linked_list(head);
    }

    // delete last element

    static Node delete_tail(Node head)
    {

        // if(head = null)
        // {
        //     return null;
        // }

        // if(head.next = null)
        // {
        //     return null;
        // }


        Node current7 = head;

        while(current7.next.next != null)
        {
            current7 = current7.next;
        }

        current7.next = null;
        return head;

    }

    static void print_linked_list(Node head)
    {
        Node current7 = head;

        while(current7 != null)
        {
            System.out.print(current7.data+ " ");

            current7 = current7.next;
        }
    }
}
