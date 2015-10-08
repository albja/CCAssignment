/**
 * Created by jacobliu on 15/10/7.
 */
public class Solution04 {
    /*
    * The ants will collide when they move towards each other.
    * For three ants, the probability that they collide is:
    * P(collide) = 1 - P(not collide) = 1 - P(move in the same direction)
    *            = 1 - (P(move clockwise) + P(move counter clockwise))
    *            = 1 - ((1/2)^3 + (1/2)^3)
    *            = 1 - 1/4
    *            = 3/4
    * For n ants, the probability that they collide is:
    * P(collide) = 1 - P(not collide) = 1 - P(move in the same direction)
    *            = 1 - (P(move clockwise) + P(move counter clockwise))
    *            = 1 - ((1/2)^n + (1/2)^n)
    *            = 1 - (1/2)^(n-1)
    * */
}
