/**
 * Created by jacobliu on 15/10/3.
 */
public class Solution04 {
    public static int NextSmallest(int d) {
        int rightMostOne, leftMostOne, MiddleOnes;
        //start from right, find the first set bit
        rightMostOne = d & (-d);

        //start from right, find the first zero followed by successive(>=1) ones and set it to one
        leftMostOne = d + rightMostOne;

        //isolate the middle set bits from the rest bits in the left hand of leftMostOne
        MiddleOnes = d ^ leftMostOne;

        //shift middle ones to the extreme right side and delete 2 duplicated ones
        MiddleOnes = (MiddleOnes/rightMostOne)>>2;

        return MiddleOnes | leftMostOne;
    }

    public static int PreviousLargest(int d){
        //find the first one p followed by successive zeros and swap p with its left zero,
        //shift all following ones to left most side
        //Thinking it in another way, for ~d, it is to find fist zero followed by successive ones and
        //shifting all zeros to left most side is equal to shifting all ones to right most side.
        //thus it is exact the same operation of find NextSmallest number for ~d, and flip the result
        //we then get PreviousLargest number for d.
        return ~NextSmallest(~d);
    }

    public static String printBinaryString(int s){
        String str = String.format("%32s", Integer.toBinaryString(s & 0xFFFFFFFF)).replace(' ', '0');
        return str;
    }

    public static void main(String[] args) {
        // write your code here
        int d = 46;
        int s = NextSmallest(d);
        int l = PreviousLargest(d);
        System.out.println(d + " " + printBinaryString(d));
        System.out.println(s + " " + printBinaryString(s));
        System.out.println(l + " " + printBinaryString(l));
    }
}
