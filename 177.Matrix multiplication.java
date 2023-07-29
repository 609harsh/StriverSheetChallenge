import java.util.* ;
import java.io.*; 

public class Solution {
	static int[][] dp = new int[100][100];
 
  // Function for matrix chain multiplication
	static int matrixChainMemoised(int[] p, int i, int j)
	{
		if (i == j) 
		{
		return 0;
		}
		if (dp[i][j] != -1) 
		{
		return dp[i][j];
		}
		dp[i][j] = Integer.MAX_VALUE;
		for (int k = i; k < j; k++) 
		{
		dp[i][j] = Math.min(
			dp[i][j], matrixChainMemoised(p, i, k)
			+ matrixChainMemoised(p, k + 1, j)
			+ p[i - 1] * p[k] * p[j]);
		}
		return dp[i][j];
	}
	
	static int MatrixChainOrder(int[] p, int n)
	{
		int i = 1, j = n - 1;
		return matrixChainMemoised(p, i, j);
	}
	public static int matrixMultiplication(int[] arr , int N) {
		for (int[] row : dp)
      	Arrays.fill(row, -1);
		// Write your code here
		return MatrixChainOrder(arr, N);

	}
}
