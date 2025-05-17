import java.util.ArrayList;
import java.util.List;

public class KidsCandies {

    public static List<Boolean> solveIt(int[] candies, int extraCandies){

        List<Boolean> result = new ArrayList<>();
        //find MAX
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] > max)
                max = candies[i];
        }
        for (int i = 0; i < candies.length; i++) {
            result.add(i, (candies[i] + extraCandies >= max));
        }

        return result;
    }

}
