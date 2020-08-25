package quiz4.question6;

/**
 * Created by Dorji Norbu on 25-Aug-20.
 */
public class Solution {
    public String restoreString(String str, int[] indices) {
        char temp[]=new char[str.length()];
        for(int i=0; i<indices.length;i++){
            temp[indices[i]]=str.charAt(i);
        }

        return new String(temp);
    }
}
