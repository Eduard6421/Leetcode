import java.util.ArrayList;
import java.util.List;

public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {


        List<Boolean> list= new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for (int numCandies : candies) {
            if(numCandies > max) {
                max = numCandies;
            }
        }

        List<Boolean> resultList = new ArrayList<>();

        for (int numCandies : candies) {
            if(numCandies + extraCandies >= max){
                resultList.add(true);
            }
            else{
                resultList.add(false);
            }
        }

        return resultList;
    }
}