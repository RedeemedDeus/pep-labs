public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        for(int x = 0; x < arr.length; x++)
        {
            for(int y = x + 1; y < arr.length; y++)
            {
                if(arr[x] > arr[y])
                {
                    return false;
                }
            }
        }

        return true;
    }
}
