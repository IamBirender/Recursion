package Java;
/**
 * return the maximum profit obtained in the knapsack with given capacity 
 */
public class Knapsack_01
{
    static int res = 0;
    public static int knapsack(int[] weight, int[] value, int capacity, int N)
    {
        if (N == 0 || capacity == 0)
        {
            return 0;
        }

        if(weight[N-1] > capacity)
        {
            return knapsack(weight, value, capacity, N-1);
        }

        else
        {
            return Math.max(value[N-1]+knapsack(weight, value, capacity - weight[N-1], N-1), knapsack(weight, value, capacity, N-1));
            
        }
       
       

    }


    public static void main(String[] args)
    {
        int[] weight = {1,3,4,5};
        int[] value = {1,4,5,7};
        int capacity = 7;
        int N = weight.length;
        System.out.println(knapsack(weight, value, capacity, N));
    }
}