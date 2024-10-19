class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        m = {}
        for i in range(len(s)):
            m[s[i]] = i
        runSum = 0
        for i in range(len(t)):
            runSum += abs(i - m[t[i]])
        return runSum