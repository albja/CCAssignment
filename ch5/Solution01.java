/**
 * Created by jacobliu on 15/10/2.
 */
public class Solution01 {
    public static int bitInsertion(int M, int N, int j, int i){
        int ones = ~0;
        //use bit mask to clear bits in N from position j to i
        int mask =  (ones << (j+1)) | ((1 << i)-1);
        N &= mask;
        //merge M into N
        N |= (M<<i);
        return N;
    }

    public static String printBinaryString(int s){
        String str = String.format("%16s", Integer.toBinaryString(s & 0xFFFFFFFF)).replace(' ', '0');
        return str;
    }

    public static void main(String[] args) {
        // write your code here
        int n = 1<<10, m=19;
        int s = bitInsertion(m,n,6,2);
        System.out.println(printBinaryString(s));
    }
}
