
// Array implementation of stack

// basic stack implementaion includes push, pop, isempty, size methods

class mystack
{
    int top;
    int cap;
    int arr[];

    mystack(int c)
    {
        cap = c;
        top = -1;
        
        arr = new int[cap];
    }


    // push method

    void push(int x)
    {
        if(top == cap - 1)
        {
            System.out.println("stack is full");
            return;
        }

        top++;
        arr[top] = x;

    }

    // pop method

    int pop()
    {
        if(top == -1)
        {
            System.out.println("stack is empty");
            return Integer.MIN_VALUE;
        }

        int res = arr[top];
        top--;

        return res;
    }

    // 

    int peek()
    {
        if(top == -1)
        {
            System.out.println("stack is empty");
            return Integer.MIN_VALUE;
        }

        return arr[top];
    }

    // 
    int size()
    {
        return top+1;
    }

    boolean isempty()
    {
        return top == -1;
    }
}


class stack
{
    public static void main(String[] args) 
    {

        mystack s = new mystack(5);

        s.push(87);
        s.push(100);
        s.push(109);
        s.pop();

        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isempty());

        // System.out.println(s.push(x)); error


        
    }
}

