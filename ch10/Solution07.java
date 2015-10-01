/**
 * Created by jacobliu on 15/9/26.
 */
public class Solution07 {
    /*
    * use bit vector to map 4 billion numbers. There are 4 billion = 2^32 integers,
    * and 2^31 distinct non-negative integers. and we have 1 GB memory, which is
    * 8 billion = 2*2^32 bits. Therefore, we can use each bit to indicate 1 number.
    * */
    //suppose nums is the read buffer, we can keep reading fixed size data from file and manipulate the
    //buffer in each iteration. Here is just a simplified example code to illustrate how to use bit vector
    //to find the missing integer.
    public static int MissingInt(int[] nums){
        long size = (long)Integer.MAX_VALUE +1;
        byte[] bitVector = new byte[(int)size/8];

        for(int i=0; i<nums.length; ++i)
            bitVector[nums[i]/8] |= 1 << (nums[i]%8);

        for(int i=0; i<bitVector.length; ++i){
            for(int j=0; j<8; ++j){
                int bit = nums[i] & (1<<j);
                if(bit == 0)
                    return i*8 + j;
            }
        }
        return -1;  //return -1 if such integer does not exist in the file.
    }

    public static void main(String[] args) {
    }
}

