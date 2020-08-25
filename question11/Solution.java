package quiz4.question11;

/**
 * Created by Dorji Norbu on 25-Aug-20.
 */
public class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
//        int k = 0;
//        int count = arr1.length;//assume all elements are valid
//        for(int m = 0; m < arr2.length && k< arr1.length; m++){
//
//            if(Math.abs(arr1[k] - arr2[m]) <= d) {
//                k++;
//                m = -1;
//                count--;//take off the invalid element
//            }
//            if(m== arr2.length-1){//in case the prior element is valid
//                k++;
//                m = -1;
//            }
//        }
//        return count;
        int distance = arr1.length;

        outer:
        for (int n1 : arr1) {
            for(int n2 : arr2) {
                if(Math.abs(n1 - n2) <= d) {
                    distance--;
                    continue outer;
                }
            }
        }
        return distance;
    }
}
