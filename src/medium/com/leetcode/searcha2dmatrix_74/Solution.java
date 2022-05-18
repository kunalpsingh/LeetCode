/*

74. Search a 2D Matrix

Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104

*/

package medium.com.leetcode.searcha2dmatrix_74;

public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
        int low=0, high=matrix.length-1;
        int index=0, mid;
        while(low<=high) {
    		index = low + (high-low)/2;
    		if(matrix[index][matrix[0].length-1]==target || matrix[index][0]==target)
    			return true;
    		else if(matrix[index][0]<target && matrix[index][matrix[0].length-1]>target)
    			break;
    		else if(matrix[index][0]>target)
    			high = index - 1;
    		else
    			low = index + 1;
        }
		low=0; high=matrix[0].length-1;
		while(low<=high) {
			mid = low + (high - low)/2;
			if(matrix[index][mid]==target)
				return true;
			else if(matrix[index][mid]>target)
				high = mid-1;
			else
				low = mid+1;
		}
		return false;
    }
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		System.out.println(sol.searchMatrix(matrix, 3));
		System.out.println(sol.searchMatrix(matrix, 10));
		System.out.println(sol.searchMatrix(matrix, 11));
		System.out.println(sol.searchMatrix(matrix, 13));
	}
}
