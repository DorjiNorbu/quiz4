package quiz4.question8;

/**
 * Created by Dorji Norbu on 25-Aug-20.
 */
public class QuestionEight {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int startTime[] = {1, 2, 3,}, endTime[] = {3, 2, 7};
        int queryTime = 4;
//        int startTime[] = {4,}, endTime[] = {4};
//        int queryTime = 4;
//        int startTime[] = {4,}, endTime[] = {4};
//        int queryTime = 5;
//        int startTime[] = {1, 1, 1, 1}, endTime[] = {1, 3, 2, 4};
//        int queryTime = 7;
        System.out.println("The number of student doing homework at time " + queryTime + "  is: " +
                solution.busyStudent(startTime, endTime, queryTime));
    }
}
