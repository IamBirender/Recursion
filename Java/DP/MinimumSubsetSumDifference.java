/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.IntStream; 
/* Name of the class has to be "Main" only if the class is public. */
class MinimumSubsetSumDifference
{
	static int min_diff = Integer.MAX_VALUE;
	//int MinimumSubsetSumDifference()
	public static int rec_minimumSubsetDifference(int[] arr, int subset_sum, int n, int total)
	{
		
		if(n == 0 )
		{
			min_diff = Math.min(Math.abs(2* subset_sum - total),min_diff) ;
			return min_diff;
		}
		System.out.println(total);
		rec_minimumSubsetDifference(arr, subset_sum + arr[n-1], n-1, total);
		rec_minimumSubsetDifference(arr, subset_sum, n-1, total);
		
		
		return min_diff;
		
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {1,4,3,6,7};
		int n = arr.length;
		int total = IntStream.of(arr).sum();
		System.out.println(rec_minimumSubsetDifference(arr,0,n,total));
	}
}
