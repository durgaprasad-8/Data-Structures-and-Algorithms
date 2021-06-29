// direct address table

class dat
{
    int[] table = new int[1000];

    void insert(int i)
    {
        table[i] = 1;
    }

    void delete(int i)
    {
        table[i] = 0;
    }

    int search(int i)
    {
        return table[i];
    }

    public static void main(String[] args) 
    {
        
        dat data = new dat();

        data.insert(120);
        data.insert(185);
        data.insert(186);

        System.out.println(data.search(120));
        System.out.println(data.search(200));

        data.delete(185);
        // data.delete(200);

        System.out.println(data.search(185));
        
        
    }
}