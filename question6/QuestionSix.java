package quiz4.question6;

/**
 * Created by Dorji Norbu on 25-Aug-20.
 */
public class QuestionSix {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        String str = "aaiougrt"; int indices[] = {4, 0, 2, 6, 7, 3, 1, 5};
        String str="art"; int indices[] = {1,0,2};
        System.out.println("The shuffle string of \""+str+"\" is : "+ solution.restoreString(str, indices));
    }
}
