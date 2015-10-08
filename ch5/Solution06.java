/**
 * Created by jacobliu on 15/10/3.
 */
public class Solution06 {

    public static int Conversion(int a, int b){
        int c = a^b, count = 0;
        //compute how many ones in the c
        while(c != 0){
            count++;
            c &= (c-1);
        }
        return count;
    }

    public static void main(String[] args) {
        // write your code here
        int a =29, b=15;
        System.out.println(Conversion(a,b));
    }
}
