class Solution:
    def minOperations(self, nums: List[int]) -> int:
        m = {}
        for n in nums:
            m[n] = 1 + m.get(n, 0)
        total = 0
        for k, v in m.items():
            if v == 1:
                return -1
            temp_v = v
            while temp_v >= 4:
                temp_v -= 3
                total += 1
            if temp_v == 4:
                total += 2
            else:
                total += 1
        return total