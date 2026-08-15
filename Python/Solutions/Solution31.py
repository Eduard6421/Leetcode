from typing import List


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        if (len(nums) == 1):
            return None

        # Simple case. We can simply switch the last two
        if (nums[-1] > nums[-2]):
            tmp = nums[-2]
            nums[-2] = nums[-1]
            nums[-1] = tmp
            return None

        # Complex case
        current_index = len(nums)- 2

        # No inversions. array is maximum lexicographically
        while(current_index >= 0):
            if(nums[current_index] < nums[current_index+1]):
                break
            current_index -=1

        if current_index == - 1: #we just have to revert the list
            nums.reverse()
        else:
            for i in range(len(nums)-1, current_index, -1):
                if nums[i] > nums[current_index]:
                    tmp = nums[i]
                    nums[i] = nums[current_index]
                    nums[current_index] = tmp
                    break
            nums[current_index + 1:] = reversed(nums[current_index + 1:])

        return None
