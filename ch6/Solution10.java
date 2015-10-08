/**
 * Created by jacobliu on 15/10/7.
 */
public class Solution10 {
    /*
    * Use bit vector to map to bottles. Each test strip represent one bit. There are 10 test strips, so the
    * bit vector have 10 bits and can represent at most 2^10 = 1024 bottles. Hence we sort the bottles from
    * 1 to 1000, for kth bottle, we look at binary representation of k, if there is a 1 in its xth digit, we
    * put one drop from the bottle on xth test strip. After 7 days, we check the results: if xth test strip
    * is positive, we set xth digit of bit vector to 1. At last, we look at the bit vector and conver it to
    * decimal number, which is the ID of the poisoned bottle.
    * Hence, It takes 7 days to figure out the poisoned bottle.
    * */

    static ArrayList<int> bottle; // stores ID of each bottle

    public static int testStrip(){
        for(int i=0; i<1000; i++){
            int id = bottle[i];
            while(id > 0){
                int testIndex = 0;
                if(id&1 == 1)
                   addDrop(testIndex);//add one drop of ith bottle to test strip indicated by testIndex
                testIndex++;
                id >>= 1;
            }
        }
    }

    public static int getResult(){
        int bitVector = 0;
        for(int i=0; i<10; i++)
            if(isPositve(i))
                bitVector |= 1<<i;
        return bitVector;
    }
}
