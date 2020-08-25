package quiz4.question9;

/**
 * Created by Dorji Norbu on 25-Aug-20.
 */
public class Solution {
    public int maxProduct(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
//                if (((numbers[i] - 1) * numbers[j] - 1) > max) { //normal If statement
//                    max = (numbers[i] - 1) * (numbers[j] - 1);}
                //conditional if
                max = ((numbers[i] - 1) * (numbers[j] - 1)) > max ? (numbers[i] - 1) * (numbers[j] - 1) : max;
            }
        }
        return max;
    }
}
