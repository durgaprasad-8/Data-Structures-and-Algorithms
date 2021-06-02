// 
// linked list implementation of stack

class Node
{
    int data;
    
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}

class mystack2
{

    // head reference
    Node head;
    int size;

    mystack2()
    {
        head = null;
        size = 0;
    }


    // 
    void push(int x)
    {
        Node newNode = new Node(x);

        newNode.next = head;
        head = newNode;
        size++;
    }

    // 

    int pop()
    {
        if(head == null)
        {
            System.out.println("stack is empty");
        }

        int result = head.data;

        head = head.next;
        size--;
        
        return result;
    }

    // 
    int peek()
    {
        if(head == null)
        {
            System.out.println("stack is empty");

        }
        return head.data;
    }

    //
    int size()
    {
        return size;
    }

    // 
    boolean isempty()
    {
        return head == null;
    }
}


public class implementation2 {
    public static void main(String[] args) 
    {
        
        mystack2 s = new mystack2();

        s.push(3);
        s.push(48);
        s.push(10);

        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.isempty());
        
    }
    
}
