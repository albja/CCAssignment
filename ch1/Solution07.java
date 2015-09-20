
public class Solution07 {
    public static void rotate(int[][] matrix) {
        int n = matrix[0].length;
        //reverse the matrix
        for(int i=0; i<n/2; i++){
            for(int j=0; j<n; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n-1-i][j];
                matrix[n-1-i][j] = tmp;
            }
        }
        //swap element along the diagonal
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }        
    }	
    
	public static void main(String[] args) {
		int[][] m = new int[3][3];
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				m[i][j] = i+j+1;
		System.out.println("Input:");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
		rotate(m);
		System.out.println("Output:");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}
}
