/**
 * Created by jacobliu on 15/10/7.
 */
public class Solution08 {
    /*
    * To minimize the number of drops for the worst case, we should try to make sure that the number
    * of drops for egg 1 is close to the number of drops for egg 2, in such way, the total number of
    * drops can be statble.
    * Suppose we drop from Nth floor, if egg 1 doesn't broke we go up to (N+N-1)th floors, and next to
    * (N+N-1+N-2)th floor. Because the minimal possible drops for egg1 is 1, the maximal possible drops
    * for egg2 is N-1, and in each step when we add one drop for egg1, we reduce the number of potential drops
    * for egg2 by 1. so the numbers of drops for egg1 and egg2 are getting closer and closer,
    * Hence in the worst case(the egg will break when drops from 100th floor) we have:
    *               N+(N-1)+(N-2)+...+1 = 100
    *          -->  N = 14
    * In this case the number of drops will be no more than 14.
    * */
}
