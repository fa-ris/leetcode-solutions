class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        m = {}
        for w in strs:
            temp_w = ''.join(sorted(w))
            m[temp_w] = m.get(temp_w, []) + [w]
        to_ret = []
        for k, v in m.items():
            to_ret.append(v)
        return to_ret