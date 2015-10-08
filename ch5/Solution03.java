/**
 * Created by jacobliu on 15/10/2.
 */
public class Solution03 {
    //assumption: only consider the valid bits of a integer, the zeros in the left hand of
    //the first one are not counted. for example 0111111.... the first 0 in the left is not
    //considered to be flipped.
    public static int longestSequenceOfOnes(int n){
        int cur = 0, pre_zero = -1, pre_pre_zero = -1;
        int count = 0, mask = (1<<31);
        int maxOnes = 0;
        if(n == 0)  return 0;
        //find the position of first one in the n
        while((n&mask) == 0){
            count++;
            n = n<<1;
        }
        count = 32 - count;
        //maintain a window to scan the longest sequence of ones
        for(int i=0; i<count; i++){
            if((n&mask) == 0){
                int t = i-pre_pre_zero-1;
                if(t > maxOnes)
                    maxOnes = t;
                pre_pre_zero = pre_zero;
                pre_zero = i;
            }
            n = n<<1;
        }
        if(count - pre_pre_zero-1 > maxOnes)
            maxOnes = count-pre_pre_zero-1;
        return maxOnes;
    }

    public static void main(String[] args) {
        // write your code here
        int d = Integer.MAX_VALUE-1;
        System.out.println(longestSequenceOfOnes(d));
    }

}
