package quiz4.question10;

/**
 * Created by Dorji Norbu on 25-Aug-20.
 */
public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int emptyBottle = numBottles, maxBottles = numBottles;
        while ((emptyBottle / numExchange) != 0) {
            maxBottles += (emptyBottle / numExchange);
            emptyBottle = (emptyBottle / numExchange) + (emptyBottle % numExchange);
        }
        return maxBottles;
    }
}
