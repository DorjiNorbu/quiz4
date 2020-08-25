package quiz4.question7;

/**
 * Created by Dorji Norbu on 25-Aug-20.
 */
public class Solution {
    public int[] smallerNumbersThanCurrent(int[] numbers) {
        int[] countArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    count++;
                }
            }
            countArray[i] = count;
        }
        return countArray;
    }
}
