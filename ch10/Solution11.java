/**
 * Created by jacobliu on 15/9/25.
 */
public class Solution11 {
    public static void Peaks_Valleys(int[] nums){
        for(int i=1; i<nums.length; i += 2){
            int index = i-1 >= 0 && nums[i-1] > nums[i] ? i-1 : i;
            index = i+1 < nums.length &&  nums[i+1] > nums[i] ? i+1 : i;
            int tmp = nums[i];
            nums[i] = nums[index];
            nums[index] = tmp;
        }
    }

    public static void main(String[] args) {
    }

}
