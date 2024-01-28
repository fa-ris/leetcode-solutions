class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        m, l = {}, []
        for i in range(len(strs)):
            s = ''.join(sorted(strs[i]))
            m[s] = m.get(s, []) + [(strs[i])]
        return m.values()