// tree implementation

class Node
{
    int key;

    Node right;
    Node left;

    Node(int k)
    {
        key = k;
        right = left = null;
    }
}


public class implementation 
{

    public static void main(String[] args) 
    {

        Node root = new Node(100);
        root.left = new Node(200);
        root.right = new Node(300);
        root.left.left = new Node(400);
        root.right.right = new Node(500);

        
        System.out.println(root.key+ " ");
        System.out.println(root.right.key+ " ");
        System.out.println(root.left.key+ " ");
        System.out.println(root.left.left.key+ " ");
        System.out.println(root.right.right.key+ " ");
        
    }
    
}
