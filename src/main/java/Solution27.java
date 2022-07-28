/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eduard
 */
class Solution27 {

    public int removeElement(int[] nums, int val) {

        if(nums.length == 0){
            return 0;
        }
        
        int final_pos = nums.length - 1;
        int i;
        for (i = 0; i < final_pos;) {
            if (nums[i] == val) {
                int tmp = nums[i];
                nums[i] = nums[final_pos];
                nums[final_pos] = tmp;
                --final_pos;
            }
            else{
                ++i;
            }
        }
        
        if(nums[i] == val)
            return i;
        return i+1;
    }
}
