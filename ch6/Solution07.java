/**
 * Created by jacobliu on 15/10/7.
 */
import java.util.Random;

public class Solution07 {
    /*
    * Suppose one family get x boys before they have 1 girl.
    * The expected value of the number of boys B is:
    * B = 1*(1/2)^2 + 2*(1/2)^3 + .., + n*(1/2)^(n+1), n can be infinity
    * As the simulating program shows, B will approximate to 1 when n is approaches to infinity.
    * Thus the gender ratio of the new generation is 1:1.
    * */
    static int boys_of_onefamily = 0;
    static int girls_of_onefamily = 0;

    public static void oneFamily(){
        Random r = new Random();
        boys_of_onefamily = 0;
        girls_of_onefamily = 0;
        //the family will keep having children until they get one girl
        while(girls_of_onefamily == 0){
            if(r.nextBoolean())
                girls_of_onefamily++;
            else
                boys_of_onefamily++;
        }
    }

    public static double computeRatio(int n){
        int girls = 0, boys = 0;
        for(int i=0; i<n; i++){
            oneFamily();
            girls += girls_of_onefamily;
            boys += boys_of_onefamily;
        }
        return (boys/(double)(girls+boys));
    }

    public static void main(String[] args) {
        // write your code here
        int n = 10000;
        System.out.println(computeRatio(n));
    }


}
