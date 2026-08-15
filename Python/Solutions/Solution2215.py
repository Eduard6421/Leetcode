from typing import List
from collections import defaultdict

class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:

        item_map = {}

        for num in nums1:
            item_map[num] = 1

        res_1 = []
        res_2 = []

        for num in nums2:
            if num in item_map:
                if item_map[num] == 0:
                    continue
                if item_map[num] > 0:
                    item_map[num] = 0
                else:
                    item_map[num] = -1
            else:
                item_map[num] =-1

        for key in item_map:
            if item_map[key] == 1:
                res_1.append(key)
            elif item_map[key] == -1:
                res_2.append(key)


        return [res_1,res_2]
    '''

    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        set1 = set(nums1)
        set2 = set(nums2)

        return [list(set1 - set2), list(set2 - set1)]

    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
         item_map = {}

        # bit 1: exists in nums1
        for num in nums1:
            item_map[num] = 1

            # bit 2: exists in nums2
        for num in nums2:
            item_map[num] = item_map.get(num, 0) | 2

        res_1 = []
        res_2 = []

        for num, state in item_map.items():
            if state == 1:
                res_1.append(num)
            elif state == 2:
                res_2.append(num)
        
        return [res_1, res_2]
    '''
