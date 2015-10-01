/**
 * Created by jacobliu on 15/9/25.
 */
public class Solution03 {
    //Assume there may be some duplicates in the array
    public static int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l < r){
            int m = l + (r-l)/2;    //to avoid overflow
            if(nums[m] == target)   return m;
            //left half is sorted
            if(nums[l] < nums[m]){
                if(target < nums[m] && target >= nums[l])
                    r = m - 1;
                else
                    l = m + 1;
            }//right half is sorted
            else if(nums[l] > nums[m]){
                if(target > nums[m] && target <= nums[r])
                    l = m + 1;
                else
                    r = m - 1;
            }else//pass the duplicates
                ++l;
        }
        return r==l && nums[r] == target ? r : -1;
    }


    public static void main(String[] args) {
    }
}
