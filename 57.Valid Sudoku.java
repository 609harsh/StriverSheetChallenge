public class Solution {

	public static boolean isItSudoku(int matrix[][]) {
		return solve(matrix);
	}

	static boolean solve(int[][] arr){
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				if(arr[i][j] == 0){
					for(int c=1; c<=9; c++){
						if(canPlace(i, j, arr, c)){
							arr[i][j] = c;
						if(solve(arr))
							return true;
						else
							arr[i][j] = 0;
						}
					}
					return false;
				}
			}
		}

		return true;
	}

	static boolean canPlace(int i, int j, int[][] arr, int c){
		for(int x=0; x<9; x++){
			if(arr[x][j] == c)	return false;
			if(arr[i][x] == c)	return false;
			if(arr[3 * (i/3) + x/3][3 * (j/3) + x%3] == c)	return false;
		}

		return true;
	}
}
