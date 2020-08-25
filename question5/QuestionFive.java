package quiz4.question5;

/**
 * Created by Dorji Norbu on 24-Aug-20.
 */
public class QuestionFive {
    public static void main(String[] args) {
        int num = 3;
        int nums[] = {2, 5, 1, 3, 4, 7}, array[];
//        int nums[] = {1,2,3,4, 4, 3, 2, 1}, array[];
//        int nums[] = {1, 1, 2, 2}, array[];
        Solution solution = new Solution();
        array = solution.shuffle(nums, num);
        for (int a : array) {
            System.out.println(a);
        }
    }
}
