package quiz4.question10;

/**
 * Created by Dorji Norbu on 25-Aug-20.
 */
public class QuestionTen {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int numBottles=15, numExchange = 4;
//        int numBottles = 9, numExchange = 3;
//        int numBottles = 5, numExchange=5;
//        int numBottles = 2, numExchange = 3;
        System.out.println("Exchanging " + numExchange + " bottles to get 1 full water bottle");
        System.out.println("Number of water bottles you can drink is: " +
                solution.numWaterBottles(numBottles, numExchange));
    }
}
