class Solution643 {
    public double findMaxAverage(int[] nums, int k) {

        int left = 0 ;
        int right = k - 1;
        double currentSum = 0;

        for(int i = left ; i <= right ; ++i) {
            currentSum +=  nums[i];
        }
        currentSum /= k;

        if(nums.length == k){
            return currentSum;
        }


        double maxSum = currentSum;
        do {
            double previousValue = (double) nums[left++] / k;
            double nextValue = (double) nums[++right] / k;
            currentSum -= previousValue;
            currentSum += nextValue;
            if(maxSum < currentSum) {
                maxSum = currentSum;
            }
        }
        while(right < nums.length - 1);
        return maxSum;
    }
}