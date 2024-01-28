class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s1, s2 = {}, {}
        for letter in s:
            s1[letter] = 1 + s1.get(letter, 0)
        for letter in t:
            s2[letter] = 1 + s2.get(letter, 0)
        return s1 == s2