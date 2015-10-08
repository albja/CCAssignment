/**
 * Created by jacobliu on 15/10/7.
 */
public class Solution06 {
    /*
    * Suppose there are n people living on the island and k of them have blue eyes.
    * It takes k days for k blue-eyed people to leave.
    *
    * Proof: If k=1, then the blue-eyed person will realize that he is has blue eye and leave on the first evening.
    *        Since he knows there is at least 1 blue-eyed people and no other people has blue eyes.
    *        If k=2, no one leaves on the first evening, and the 2 blue-eyed people realize they are blue-eyed and
    *        leave on the second evening. Since for either of blue-eyed people, he knows that there is only one
    *        blue-eyed people and no one leaves on the first evening. Hence he will notice himself is blue eyed on
    *        the second evening.
    *        If k=m, the for each of m blue-eyed people, he knows that there are m-1 blue eyed people and no one
    *        leaves in the previous m-1 days. Hence he will notice that himself is blue eyed on the mth evening.
    *        And all blue-eyed people will notice that and leave on the mth evening.
    *
    * */
}
