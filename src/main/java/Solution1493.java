class Solution1493 {
    public int longestSubarray(int[] nums) {


        int leftPointer = 0;
        int rightPointer = 0;
        int maxSequence = 0;
        int currentSequence = 0;

        Boolean canRemove = true;

        while(rightPointer < nums.length) {

            if(nums[rightPointer] == 1) {
                currentSequence += 1;
            }
            if(nums[rightPointer] == 0) {
                if(!canRemove) {
                    boolean nowAvailable = false;
                    while(leftPointer < rightPointer & !nowAvailable) {

                        if(nums[leftPointer] == 1) {
                            currentSequence -= 1;
                        }
                        else {
                            nowAvailable = true;
                        }
                        ++leftPointer;
                    }
                }
                else {
                    canRemove = false;
                }
            }

            int removedItem = canRemove ? 1 : 0;

            if(maxSequence < currentSequence - removedItem) {
                maxSequence = currentSequence - removedItem;
            }

            ++rightPointer;
        }

        return maxSequence;
    }
}