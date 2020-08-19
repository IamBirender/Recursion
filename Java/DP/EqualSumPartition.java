/**
 * 
 */
package com.crm.dpPractice;

/**
 * @author Pallavi
 *
 */
public class EqualSumPartition {
	
	
	/**
	 * 
	 * @param arr
	 * @param sum
	 * @return
	 */
	public static boolean equalSumPartition_recursive(int[] arr, int sum, int n)
	{
		
		if (n == 0) return false;
		if(sum == 0) return true;
		
		if(arr[n-1] <= sum)
		{
			return equalSumPartition_recursive(arr, sum - arr[n-1], n - 1) || equalSumPartition_recursive(arr, sum, n -1);
		}
		
		else if(arr[n-1] > sum)
		{
			return equalSumPartition_recursive(arr, sum, n -1);
		}
		
		return false;
		
	}
	
	
	public static void main(String[] args)
	{
		int[] arr = {11,5,11,5};
		int sum = 11;
    int n = arr.length;
		System.out.println(equalSumPartition_recursive(arr, sum, n));
	}

}
