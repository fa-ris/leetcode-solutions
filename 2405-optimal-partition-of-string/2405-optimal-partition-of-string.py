class Solution:
    def partitionString(self, s: str) -> int:
        li = []
        s_set = set()
        for i in range(len(s)):
            if s[i] in s_set:
                li.append(s_set)
                s_set = set()
                s_set.add(s[i])
            else:
                s_set.add(s[i])
        return len(li) + 1