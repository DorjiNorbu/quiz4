package quiz4.question13;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Dorji Norbu on 25-Aug-20.
 */
public class Solution {
    public boolean uniqueOccurrence(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int a : arr) {
            if (!hashMap.containsKey(a)) {
                hashMap.put(a, 1);
            } else {
                hashMap.put(a, hashMap.get(a) + 1);
            }
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int key : hashMap.keySet()) {
            if (!hashSet.add(hashMap.get(key))) {
                return false;
            }
        }
        return true;
    }
}
//understood: use of hashMap to store key and value like in above program
// method keySet in hashMap to return only the key value in hashMap
//Since set only contain unique elements adding duplicate element is not permitted