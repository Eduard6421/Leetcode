class Solution238 {


    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Move to the next line after printing the array
    }

    public int[] productExceptSelf(int[] nums) {
        // Initialize the array v with zeroes
        int[] v = new int[nums.length];


        int prod = 1;
        v[0] = 1;
        for(int i = 0 ; i < nums.length ; i++){
            v[i] = prod;
            prod *= nums[i];
        }
        printArray(v);
        prod = 1;
        for(int i = nums.length - 1 ; i >= 0 ; i--){
            v[i] *= prod;
            prod *= nums[i];
        }
        printArray(v);
        return v;
    }
}
