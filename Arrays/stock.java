// stocj buy and sell problem
// returns the maximum profit
// efficient process

public class stock {

    static int return_max_profit(int[] price, int n)
    {
        int profit = 0;

        for(int i = 1; i < n; i++)
        {
            if(price[i] > price[i-1])
            {
                profit += price[i] - price[i-1];
            }
        }

        return profit;

    }

    public static void main(String[] args) 
    {
        int[] price = {23, 32, 90, 45, 88};
        int n = price.length;

        System.out.println("Maximun profit");
        System.out.println(return_max_profit(price, n));
        
    }
    
}
