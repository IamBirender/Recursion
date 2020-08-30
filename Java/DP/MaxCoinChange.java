
import java.util.*;
import java.lang.*;
import java.io.*;


class MaxCoinChange
{
	public static int maxCoinChange(int[] coin, int sum, int N)
	{
		int[][] dp = new int[N+1][sum+1];
		for(int i = 0; i < N+1; i++)
		{
			for(int j= 0; j < sum+1; j++)
			{
				if(i == 0 || j == 0)
				{
					if(i == 0)
					{
						dp[i][j] = 0;
					}
					if(j == 0)
					{
						dp[i][j] = 1;
					}
				}
				
				else if (coin[i-1] <= j)
				{
					dp[i][j] = dp[i][j - coin[i-1]] +  dp[i-1][j];
				}
				
				else
				dp[i][j] = dp[i-1][j];
			}
		}
		
		return dp[N][sum];
		
	}
	
	public static void main(String[] args)
	{
		int[] coins = {1,2,3};
		int sum = 5;
		int N = coins.length;
		System.out.println(maxCoinChange(coins, sum, N));
	}
}

