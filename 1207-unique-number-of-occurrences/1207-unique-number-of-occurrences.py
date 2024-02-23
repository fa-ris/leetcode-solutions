class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        m = {}
        for n in arr:
            m[n] = 1 + m.get(n, 0)
        temp_list = list(m.values())
        return len(temp_list) == len(set(temp_list))