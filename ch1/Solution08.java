
public class Solution08 {

    public static void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length, col0 = 0;
        //use 1st row and 1st column to store the info whether or not
        //this row or column should be set zeros
        for(int i=0; i<m; i++){
            if(matrix[i][0] == 0)
                col0 = 1;
            for(int j=1; j<n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        //iterate from the reverse(bottom-up, right-left) order to 
        //set zeros, so than it won't change the 1st row and column 
        //until the last moment
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>0; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
            if(col0 == 1)
                matrix[i][0] = 0;            
        }
    }
    
	public static void main(String[] args) {
		int[][] m = new int[3][3];
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				m[i][j] = i+j-1;
		System.out.println("Input:");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
		setZeroes(m);
		System.out.println("Output:");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}

}
