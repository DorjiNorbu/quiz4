package quiz4.question11;

/**
 * Created by Dorji Norbu on 25-Aug-20.
 */
public class QuestionEleven {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] arrayOne={2,1,100,3},arrayTwo={-5,-2,10,-3,7}; int distance = 6;
//        int[] arrayOne={1,4,2,3},arrayTwo={-4,-3,6,10,20,30}; int distance = 3;
        int[] arrayOne={4,5,8},arrayTwo={10,9,1,8}; int distance = 2;
        System.out.println("Number of water bottles you can drink is: " +
                solution.findTheDistanceValue(arrayOne, arrayTwo,distance));
    }
}
