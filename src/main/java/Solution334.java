public class Solution334 {

    public boolean increasingTriplet(int[] nums) {

        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

        for(int i = 0 ; i < nums.length ; ++i) {

            if(nums[i] > firstMin && nums[i] > secondMin) {
                return true;
            }

            if(nums[i] < firstMin) {
                firstMin = nums[i];
            }
            else if (nums[i] < secondMin && nums[i] != firstMin) {
                secondMin = nums[i];
            }
        }
        return false;
    }

}
