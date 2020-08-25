package quiz4.question7;

import java.util.Arrays;

/**
 * Created by Dorji Norbu on 25-Aug-20.
 */
public class QuestionSeven {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int arrayOne[] = {8, 1, 2, 2, 3}, arrayTwo[] = {6, 5, 4, 8}, arrayThree[] = {7, 7, 7, 7};

        System.out.println(" Array One: " + Arrays.toString(arrayOne) + " -> Solution: " +
                Arrays.toString(solution.smallerNumbersThanCurrent(arrayOne)));
        System.out.println(" Array Two: " + Arrays.toString(arrayTwo) + " -> Solution: " +
                Arrays.toString(solution.smallerNumbersThanCurrent(arrayTwo)));
        System.out.println(" Array Three: " + Arrays.toString(arrayThree) + " -> Solution: " +
                Arrays.toString(solution.smallerNumbersThanCurrent(arrayThree)));

    }
}
