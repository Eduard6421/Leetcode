import java.util.Arrays;

class Solution1679 {
    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);

        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int cnt = 0;

        if(nums.length < 2) {
            return 0;
        }

        while(leftPointer < rightPointer) {
            int sum = nums[leftPointer] + nums[rightPointer];
            if( sum== k) {
                cnt += 1;
                ++leftPointer;
                --rightPointer;
            }
            else if( sum < k ){
                ++leftPointer;
            }
            else {
                --rightPointer;
            }
        }
        return cnt;

    }
}