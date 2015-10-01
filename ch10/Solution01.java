/**
 * Created by jacobliu on 15/9/24.
 */
public class Solution01 {
    //assume that a has enough buffer to hold B and the size of a
    //is equal to the number of total elements in two arrays
    public static void SortedMerge(int[] a, int[] b){
        int sizeA = a.length - b.length, sizeB = b.length;
        int i = sizeA - 1, j = sizeB - 1, k = a.length - 1;
        while(j >= 0){
            a[k--] = a[i] > b[j] ? a[i--] : b[j--];
        }
    }


    public static void main(String[] args) {
    }
}
