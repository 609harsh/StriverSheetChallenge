import java.util.ArrayList;

public class Solution {
	static int max(int a, int b) { return (a > b) ? a : b; }
	public static int maxProfit(ArrayList<Integer> val, ArrayList<Integer> wt, int n, int W) {
		// Write your code here.
		int i, w;
        int K[][] = new int[n + 1][W + 1];
        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt.get(i - 1) <= w)
                    K[i][w]
                        = max(val.get(i - 1)
                                  + K[i - 1][w - wt.get(i - 1)],
                              K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
        return K[n][W];
	}
}
