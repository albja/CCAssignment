/**
 * Created by jacobliu on 15/10/3.
 */
public class Solution01 {

    /*
    * Take 1 pill from bottle #1, take 2 pills from bottle #2,....
    * take k pills from bottle #k, then weigh them together.
    * suppose the weight is m, (m - (1+2+3+..+k))/0.1 is the number of
    * bottle with pills of weight 1.1 grams.
    * Because if all bottles have pills of the same wright, then the total
    * weight will be (1+2+..+k) = (1+k)k/2, if bottle #x has pills of weight
    * 1.1, then there will be 0.1*x extra weight, thus the heavy bottle number is
    * (m - (1+k)k/2)/0.1.
    * */
}
