class Solution283 {
    public void moveZeroes(int[] nums) {
        int countPositive = 0;

        for(int i = 0 ; i < nums.length ; ++i) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[countPositive];
                nums[countPositive] = temp;
                countPositive +=1;
            }
        }
    }
}