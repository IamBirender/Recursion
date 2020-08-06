package Java;

public class KnapsackMemoization {


    public static int knapsack(int[] weight, int[] value,int capacity, int N,int[][] mem)
    {
        if (N == 0 || capacity == 0)
        {
            return 0;
        }

       if(mem[N][capacity] != 0)
       {
           return mem[N][capacity];
       }
        if(weight[N-1] > capacity)
        {
            return knapsack(weight, value, capacity, N-1,mem);
        }

        else
        {
            return Math.max(value[N-1]+knapsack(weight, value, capacity - weight[N-1], N-1,mem), knapsack(weight, value, capacity, N-1,mem));
            
        }
       
       
    }
    


    public static void main(String[] args)
    {
        int[] weight = {1,3,4,5};
        int[] value = {1,4,5,7};
        int capacity = 7;
        int N = weight.length;

        int[][] mem = new int[N+1][capacity+1];
        System.out.println(knapsack(weight, value, capacity, N,mem));
    }

}