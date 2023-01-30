

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        for(int x = 0; x < nums.length; x++)
        {
            for(int y = x+1; y < nums.length; y++)
            {
                if(nums[x] == nums[y]) return true;
            }
        }
        
        return false;
    }
}
