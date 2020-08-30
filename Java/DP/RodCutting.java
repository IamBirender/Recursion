import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RodCutting
{
	static int profit = 0;
	
  public static int rodCutting(int[] length, int [] price, int N)
  {
  	int[][] dp = new int[N+1][N+1];
  	for(int i = 1; i < N+1; i++)
  	{
  		for(int j = 1; j < N+1; j++)
  		{
  			
  			
  			if(length[i-1] <= j)
  			{
  				dp[i][j] = Math.max(price[i-1]+ dp[i][j- length[i-1]], dp[i-1][j]);
  			}
  			
  			else
  			{
  				dp[i][j] =  dp[i-1][j];
  			}
  		}
  	}
  	
  	return dp[N][N];
  }
  public static void main(String[] args)
  {
  	int [] length = {1,2 , 3, 4, 5, 6, 7, 8};
  	int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
  	int N = 8;
  	int subparts = price.length;
  	System.out.println(rodCutting(length, price,N));
  }
}
