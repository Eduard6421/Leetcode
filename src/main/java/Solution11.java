class Solution11 {
    public int maxArea(int[] height) {

        int leftPointer = 0;
        int rightPointer = height.length - 1;

        int maxWater = 0;

        while (leftPointer < rightPointer) {

            boolean leftSmaller = false;
            if (height[leftPointer] < height[rightPointer]) {
                leftSmaller = true;
            } else {
                leftSmaller = false;
            }


            int currentWater = Math.min(height[leftPointer], height[rightPointer]) * (rightPointer - leftPointer);

            if (currentWater > maxWater) {
                maxWater = currentWater;
            }

            if (leftSmaller) {
                leftPointer += 1;
            } else rightPointer -= 1;
        }

        return maxWater;

    }
}