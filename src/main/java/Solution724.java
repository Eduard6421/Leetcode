class Solution724 {
    public int pivotIndex(int[] nums) {


        if(nums.length == 0) {
            return -1;
        }
        if(nums.length == 1) {
            return 0;
        }

        if(nums.length == 2) {
            if(nums[0] == 0) {
                return 1;
            }
            if(nums[1] == 0) {
                return 0;
            }
        }

        int[] arrLeft  = new int[nums.length + 2];
        int[] arrRight = new int[nums.length + 2];

        for(int i = 1 ; i <= nums.length ; ++i) {
            arrLeft[i] += arrLeft[i-1] + nums[i-1];
        }
        for(int i = nums.length ; i >= 1  ; --i) {
            arrRight[i] = arrRight[i+1] + nums[i-1];
        }

        for(int i = 1 ; i <= nums.length ; ++i) {
            if(arrLeft[i-1] == arrRight[i+1]){
                return i-1;
            }
        }

        return -1;
    }
}