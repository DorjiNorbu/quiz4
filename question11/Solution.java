package quiz4.question11;

/**
 * Created by Dorji Norbu on 25-Aug-20.
 */
public class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int dist) {
        int distance = arr1.length;

        outerFor:
        for (int numberOne : arr1) {
            for (int numberTwo : arr2) {
                if (Math.abs(numberOne - numberTwo) <= dist) {
                    distance--;
                    continue outerFor;
                }
            }
        }
        return distance;
    }
}
