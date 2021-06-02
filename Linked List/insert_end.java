// insert at the end of the singly linked list


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


public class insert_end 
{
   

    
    // method for insert at end

    static Node insert_end_linked(Node head, int x)
    {

        Node new_node = new Node(x);

        if(head == null)
        {
            return new_node;
        }

        Node current3 = head;
        while(current3.next != null)
        {
            current3 = current3.next;
        }

        current3.next = new_node;

        return head;
    }



    public static void main(String[] args) 
    {
        Node head = null;

        head = insert_end_linked(head, 309);
        head = insert_end_linked(head, 319);
        head = insert_end_linked(head, 329);
        head = insert_end_linked(head, 380);


        print_linked_list(head);
        
    }


    // to print the final nodes in the linked list

    public static void print_linked_list(Node head)
    {
        Node current3 = head;

        while(current3 != null)
        {
            System.out.println(current3.data+ " ");
            current3 = current3.next;
        }
    }
    
}
