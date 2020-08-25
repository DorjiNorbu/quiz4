package quiz4.question8;

/**
 * Created by Dorji Norbu on 25-Aug-20.
 */
public class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] == queryTime || endTime[i] == queryTime) {
                count++;
            } else {
                continue;
            }
        }
        return count;
    }
}
