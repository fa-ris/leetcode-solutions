class Solution:
    def countOnes(self, num: int) -> int:
        ret = 0
        while num:
            if num % 2:
                ret += 1
            num = num >> 1
        return ret
    def sumIndicesWithKSetBits(self, nums: List[int], k: int) -> int:
        s = 0
        for i in range(len(nums)):
            if self.countOnes(i) == k:
                s += nums[i]
        return s