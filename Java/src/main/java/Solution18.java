
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eduard
 */
class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
	
	List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for(int i = 0 ; i < nums.length - 3; ++i){
            if( i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1 ; j < nums.length -2; ++j){
                if( j > i+1 && nums[j] == nums[j-1]) continue;
                
                long newTarget = (long)target - nums[i] - nums[j];
                
                int left = j+1;
                int right = nums.length -1;
                
                while(left < right){
                    
                    if(nums[left] + nums[right] == newTarget){
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                        while(left < right && nums[left] == nums[left-1]) ++left;
                        while(left < right && nums[right] == nums[right+1]) --right;
                    }
                    else if(nums[left] + nums[right] < newTarget){
                        left++;
                        while(left < right && nums[left] == nums[left-1]) ++left;
                    }
                    else{
                        right--;
                        while(left < right && nums[right] == nums[right+1]) --right;
                    }
                    
                }
                
                
            }
        }
    return result;
    }
}