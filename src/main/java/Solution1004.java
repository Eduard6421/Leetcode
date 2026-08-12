class Solution1004 {
    public int longestOnes(int[] nums, int k) {


        int currentNumOfZeros = 0;

        int leftPointer = 0;
        int rightPointer = 0 ;

        int maxSequence = 0;
        int currentSequence = 0;


        while(rightPointer < nums.length) {

            if(nums[rightPointer] == 1) {
            }
            else if (nums[rightPointer] == 0) {
                currentNumOfZeros += 1;
            }
            currentSequence += 1;
            while(currentNumOfZeros > k) {
                if(nums[leftPointer] == 0) {
                    currentNumOfZeros -= 1;
                }
                currentSequence -= 1;
                ++leftPointer;
            }

            if(currentSequence > maxSequence) {
                maxSequence= currentSequence;
            }

            ++rightPointer;
        }
        return maxSequence;
    }
}