/**
 * Created by jacobliu on 15/9/25.
 */
public class Solution04 {
    public static int elementAt(int index){
        return 0;
    }

    //assume return -1 if x doesn't exist.
    public static int SortedSearch( int target){
        int l = 0, r = 1;
        //find the upper bound of index for the element in the array
        while(elementAt(r) != -1 || elementAt(r) < target)
            r *= 2;
        //binary search
        while(l <= r){
            int m = l + (r-l)/2;
            if(elementAt(m) == -1 || target < elementAt(m))
                r = m-1;
            else if(target > elementAt(m))
                l = m+1;
            else
                return m;
        }
        return -1;
    }

    public static void main(String[] args) {
    }

}
