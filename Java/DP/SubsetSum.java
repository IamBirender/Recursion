


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SubsetSum
{
	public static boolean[][] dp;
	public static boolean subsetSum(int[] arr, int sum)
	{
		int n = arr.length;
		
		dp = new boolean[n+1][sum+1];
		for(int i = 0; i < n+1;i++)
		{
			for(int j = 0; j < sum+1; j++)
			{
				if(j == 0)
				{
				 dp[i][j] = true;	
				}
				
				else if(i == 0)
				{
					dp[i][j] = false;
					
				}
				
				
			  else if (arr[i-1] <= j)
				{
					dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
				}
				
				else
				dp[i][j] = dp[i-1][j];
			//	System.out.println(dp[i][j]);
			}
		}
		
		return dp[n][sum];
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {2,3,7,8,10};
		int sum = 5;
		System.out.println(subsetSum(arr, sum));
		
	}
}
