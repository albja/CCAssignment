/**
 * Created by jacobliu on 15/10/2.
 */
public class Solution02 {

    public static String BinaryToString(double d){
        char[] s = new char[32];
        for(int i=0; i<32; i++) s[i] = '0';
        //Convert decimal to binary digits.
        for(int i=0; i<32; i++){
            d *= 2;
            if(d >= 1) {
                d -= 1;
                s[i] = '1';
            }
        }
        //d can not be accurately approximate by binary number.
        if(d != 0)
            return new String("ERROR");
        return new String(s);
    }

    public static void main(String[] args) {
        // write your code here
        double d = 0.125;
        System.out.println(BinaryToString(d));
    }
}
