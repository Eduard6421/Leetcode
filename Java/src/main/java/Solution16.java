
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eduard
 */
public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
            
        Arrays.sort(nums);
        
        int minDiff = 9999999;
        int total_sum = 0;
        
        int sum;
        int left,right;
        
        for(int i = 0 ; i < nums.length - 2; ++i){
            
            left = i + 1;
            right = nums.length - 1;

            while(left<right){
                sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - sum) < minDiff){
                    minDiff = Math.abs(target-sum);
                    total_sum = sum;
                }
                
                if(minDiff == 0){
                    return total_sum;
                }
                
                if(sum < target){
                    ++left;
                }
                else{
                    --right;
                }
            }
        }
        
        return total_sum;
    }
}