class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        dict1 = {}
        dict2 = {}
        intersect = []
        for x in nums1:
            if x in dict1:
                dict1[x] += 1
            else:
                dict1[x] = 1
        for x in nums2:
            if x in dict2:
                dict2[x] += 1
            else:
                dict2[x] = 1
        for key in dict1:
            if key in dict1 and key in dict2:
                if (dict1[key] > dict2[key]):
                    for i in range(0, dict2[key]):
                        intersect.append(key)
                else:
                    for i in range(0, dict1[key]):
                        intersect.append(key)
        return intersect