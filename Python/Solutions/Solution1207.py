from collections import defaultdict
from typing import List


class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:

        dict = defaultdict(int)
        dict2 = defaultdict(int)
        for num in arr:
            dict[num] += 1

        for key,value in dict.items():
            if dict2[value]:
                return False
            else:
                dict2[value] += 1

        return True
