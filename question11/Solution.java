package quiz4.question11;

/**
 * Created by Dorji Norbu on 25-Aug-20.
 */
public class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int dist) {
        int distance = arr1.length;

        outerFor:
        for (int n1 : arr1) {
            for (int n2 : arr2) {
                if (Math.abs(n1 - n2) <= dist) {
                    distance--;
                    continue outerFor;
                }
            }
        }
        return distance;
    }
}
