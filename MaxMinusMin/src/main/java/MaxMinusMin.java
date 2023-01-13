
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int high = nums.get(0);
        int low = nums.get(0);

        for(int i = 1; i < nums.size(); i++)
        {
            if(low > nums.get(i))
            {
                low = nums.get(i);
            }
            else if(high < nums.get(i))
            {
                high = nums.get(i);
            }
        }

        return high - low;
    }
}
