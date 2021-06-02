// insert an element at beginning of the linked list


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



public class insert_begin 
{

    static Node insert_at_begin(Node head, int x)
    {

    Node new_node = new Node(x);
    new_node.next = head;
    return new_node;
    }

    public static void main(String[] args) 
    {

        Node head = null;

        head = insert_at_begin(head, 139);
        head = insert_at_begin(head, 183);
        head = insert_at_begin(head, 224);


        // traverse the linked list
        print_linked_list(head);
        
    }


    public static void print_linked_list(Node head)
    {

        Node current2 = head;

        while(current2 != null)
        {
            System.out.print(current2.data+ " ");
            current2 = current2.next;
        }
    }
    
}
