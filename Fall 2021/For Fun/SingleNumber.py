class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        unique = dict()
        for i in range(len(nums)):
            if nums[i] in unique:
                del unique[nums[i]]
            else:
                unique[nums[i]] = 1
        for key in unique:
            return key
