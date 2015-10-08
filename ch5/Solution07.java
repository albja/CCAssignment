/**
 * Created by jacobliu on 15/10/3.
 */
public class Solution07 {
    public static int bitwiseSwap(int d){
        int mask1 = 0xAAAAAAAA, mask2 = 0x55555555;
        //if d < 0, right shift operation >> will add 1 in the left, it wont affect the result.
        return ((d&mask1)>>1) | ((d&mask2)<<1);
    }


    public static String printBinaryString(int s){
        String str = String.format("%32s", Integer.toBinaryString(s & 0xFFFFFFFF)).replace(' ', '0');
        return str;
    }

    public static void main(String[] args) {
        // write your code here
        int b=5;
        System.out.println(printBinaryString(b));
        System.out.println((printBinaryString(bitwiseSwap(b))));
    }
}
