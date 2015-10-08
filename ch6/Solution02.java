/**
 * Created by jacobliu on 15/10/3.
 */
public class Solution02 {
    /*
    * The probability of winning Game 1: P(making one shot) = p;
    * The probability of winning Game 2:
    *   P(making exact 2 shots + making 3 shots) = C(3,2)(combine 2 from 3)p^2(1-p) + p^3
    *   = 3p^2(1-p) + p^3 = 3p^2 - 3p^3 + p^3 = 3p^2 - 2p^3.
    * Suppose we pick Game 2 then the following should hold true:
    *   3p^2 - 2p^3 > p  <-->  2p^3-3p^2+p < 0 <--> p(2p-1)(p-1) < 0
    *   solve that inequality, we get 0.5 < p < 1;
    * With the similar logic, we can get the range of p to play Game 1: 0 < p < 0.5
    * Hence, if 0.5 < p < 1, we should play Game 1; if 0.5 < p < 1, we should pick Game 2.
    * When p = 0, 0.5 or 1, we have the same probability to win two games, in that case, we can pick either one.
    * */

}
