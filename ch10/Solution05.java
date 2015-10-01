/**
 * Created by jacobliu on 15/9/26.
 */
public class Solution05 {
    //assume return -1 if input is invalid or cannot find the element
    public static int SparseSearch(String[] strs, String target){
        if(strs == null || target == null)
            return -1;
        int l = 0, r = strs.length - 1;
        while(l <= r){
            int m = l + (r-l)/2;
            if(strs[m].isEmpty()){
                //if target string is ""
                if(strs[m].equals(target))
                    return m;
                int ll = m-1, rr = m+1;
                //find the non-empty middle string to do the comparison
                while(true){
                    if(ll < l && rr > r)    return -1;  //target doesn't exist
                    if(ll >= l && !strs[ll].isEmpty()){
                        m = ll;
                        break;
                    }
                    if(rr <= r && !strs[rr].isEmpty()) {
                        m = rr;
                        break;
                    }
                    --l;
                    ++r;
                }
            }
            //do the binary search after find a non-empty middle string
            if(target.equals(strs[m]))
                return m;
            else if(target.compareTo(strs[m]) < 0)
                r = m-1;
            else
                l = m+1;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
