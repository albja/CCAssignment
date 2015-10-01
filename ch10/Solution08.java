/**
 * Created by jacobliu on 15/9/26.
 */
public class Solution08 {
    /*
     * There are 4KB memory, which are 32K bits, we can use a
     * bit vector to map each distinct number to one bit.
     * Then we can scan the bit vector to print the duplicates
     * in one pass.
     * */
    //Here I assume the array is already stored in the memory, this is a simplified example code to illustrate the
    //core algorithm of how to use bit vector to find the duplicates. File I/O operations are not considered.
    public static void FindDuplicates(int[] nums){
        int N = 32000/8;
        byte[] bitVector = new byte[N];
        for(int i=0; i<N; ++i){
            int index = (nums[i]-1) / 8;
            int offset = (nums[i]-1) % 8;
            if((bitVector[index] & (1<<offset)) == 0)
                bitVector[index] |= 1<<offset;
            else
                System.out.println(nums[i]); //print the duplicate
        }
    }

    public static void main(String[] args) {
    }
}
