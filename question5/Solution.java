package quiz4.question5;

/**
 * Created by Dorji Norbu on 25-Aug-20.
 */
public class Solution {
    public int[] shuffle(int[] nums, int num) {
        int[] array = new int[2 * num];
        for (int i = 0, j = num, k = 0; i < 2 * num && j < nums.length; i = i + 2, j++, k++) {
            array[i] = nums[k];
            array[i + 1] = nums[j];
        }
        return array;
    }
}
