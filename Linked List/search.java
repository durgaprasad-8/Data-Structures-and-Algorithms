// search in a linked list


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

public class search {

    public static void main(String[] args) 
    {
        
        Node head = new Node(200);
        head.next = new Node(219);
        head.next.next = new Node(209);
        head.next.next.next = new Node(208);

        print_linked_list(head);

        System.out.println("Position of the data is "+ search_data(head, 200));

    }

    static int search_data(Node head, int x)
    {
        int position = 1;
        
        Node current = head;

        while(current != null)
        {
            if(current.data == x)
            {
                return position;
            }

            else
            {
                position++;
                current = current.next;
            }
        }

        return -1;
    }

    public static void print_linked_list(Node head)
    {
        Node current = head;

        while(current != null)
        {
            System.out.print(current.data+ " ");
            current = current.next;
            System.out.println();
        }
    }
    
}
