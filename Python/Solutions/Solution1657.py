from collections import defaultdict


class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:


        def array_difference(arr1,arr2):
            local_dict = defaultdict(int)

            for i in range(len(arr1)):
                local_dict[arr1[i]]+=1

            for i in range(len(arr2)):
                local_dict[arr2[i]]-=1

            values = local_dict.values()

            for value in values:
                if value != 0:
                    return False

            return True


        if len(word1) != len(word2):
            return False

        dict1 = defaultdict(int)
        dict2 = defaultdict(int)

        for i in range(len(word1)):
            dict1[word1[i]] += 1
        for i in range(len(word2)):
            dict2[word2[i]] += 1

        dict1_values = list(dict1.values())
        dict2_values = list(dict2.values())

        return array_difference(dict1_values, dict2_values)

