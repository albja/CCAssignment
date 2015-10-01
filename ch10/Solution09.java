/**
 * Created by jacobliu on 15/9/25.
 */
public class Solution09 {
    //assume: return true if find the element, otherwise return false
    //solution 1 O(m+n)
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        while(i<matrix.length && j>=0) {
            if(target == matrix[i][j])  return true;
            if(target > matrix[i][j])   ++i;
            else --j;
        }
        return false;
    }

    //solution 2 O(mlogn)
    public static int binarySearch(int[][] matrix, int row, int target){
        int l = 0, r = matrix[row].length - 1;
        while(l < r){
            int m = l + (r-l)/2;
            if(matrix[row][m] == target)     return m;
            if(target < matrix[row][m])  r = m;
            else    l = m + 1;
        }
        return matrix[row][l] == target ? l : -1;
    }

    public static boolean searchMatrix2(int[][] matrix, int target) {
        int r = matrix.length;
        int top = 0, bottom = r-1, m = 0;
        while(top < bottom){
            m = top + (bottom-top)/2;
            if(target > matrix[m][0])
                top = m + 1;
            else
                bottom = m;
        }
        m = top;
        while(m > 0 && matrix[m][0] > target)    m--;
        while(m >= 0){
            int index = binarySearch(matrix, m, target);
            System.out.print(index);
            if(index != -1)     return true;
            m--;
        }
        return false;
    }


    public static void main(String[] args) {
    }
}
